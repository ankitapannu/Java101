package main;

import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import main.Stats;

public class TweetEvents {
	
	private String timestamp;
	private int count;
	
	
	private TreeMap<Long, Stats> tweets;
	private TreeMap<Long, Stats> retweets;
	private TreeMap<Long, Stats> likes;
	private TreeMap<Long, Stats> replies;
	private ArrayList<TreeMap<Long, Stats>> logs;
	
	public TweetEvents() {
		tweets = new TreeMap<Long, Stats>();
		retweets = new TreeMap<Long, Stats>();
		likes = new TreeMap<Long, Stats>();
		replies = new TreeMap<Long, Stats>();
		logs = new ArrayList<TreeMap<Long, Stats>>();
		logs.add(tweets);
		logs.add(retweets);
		logs.add(likes);
		logs.add(replies);
	}
	
	public TreeMap<Long, Stats> getTweets() {
		return this.tweets;
	}
	
	public void recordEntry(String eventType, long timestamp) {
		Date d = new Date(timestamp);
		int year = d.getYear() + 1900;
		System.out.println("year: " + year);
		int month = d.getMonth() + 1;
		System.out.println("month: " + month);
		int date = d.getDate();
		System.out.println("date: " + date);
		long yearLong = year * 1000L;
		long monthLong = month * 100L;
		long dateLong = date * 10L;
		long fullDate = yearLong + monthLong + dateLong;
		
		int hour = d.getHours();
		System.out.println("hour: " + hour);
		int min = d.getMinutes();
		System.out.println("min: " + min);
		
		if (tweets.containsKey(fullDate)) {
			Stats currentStats = tweets.get(fullDate);
			currentStats.addEvent(hour, min);
			tweets.put(fullDate, currentStats);
		} else {
			Stats newStats = new Stats();
			newStats.addEvent(hour, min);
			tweets.put(fullDate, newStats);
		}
		
	}
	
	public static void main(String[] args) {
		long l = 1610863602L;
		TweetEvents t = new TweetEvents();
		t.recordEntry("tweets", l);
		TreeMap<Long, Stats> tweets = t.getTweets();
		for (Map.Entry<Long, Stats> entry : tweets.entrySet()) {
			System.out.println(entry.getKey());
			Stats s = entry.getValue();
			System.out.println(s.getDayCount());
			int[] arr = s.getTimeCount();
			System.out.println(arr[804]);
		}
	}
	

}
