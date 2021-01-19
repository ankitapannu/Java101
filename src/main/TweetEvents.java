package main;

import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

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
	
	public TreeMap<Long, Stats> getRetweets() {
		return this.retweets;
	}
	
	public TreeMap<Long, Stats> getLikes() {
		return this.likes;
	}
	
	public TreeMap<Long, Stats> getReplies() {
		return this.replies;
	}
	
	public ArrayList<TreeMap<Long, Stats>> getLogs() {
		return this.logs;
	}
	
	public void recordEntry(String eventType, long timestamp) {		
		Date d = new Date(timestamp);
		int year = d.getYear() + 1900;
		System.out.println("year: " + year);
		int month = d.getMonth() + 1;
		System.out.println("month: " + month);
		int date = d.getDate();
		System.out.println("date: " + date);
		
		int hour = d.getHours();
		System.out.println("hour: " + hour);
		int min = d.getMinutes();
		System.out.println("min: " + min);
		
		long fullDate = 0L;
		if (hour == 0 && min == 0) {
			fullDate = timestamp; 
		} else {
			long hourMs = 60 * 60 * 1000 * hour; // hours in milliseconds
			long minMs = 60 * 1000 * min; // minutes in milliseconds
			fullDate = timestamp - hourMs - minMs;
		}
		
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
	
	public HashMap<Long, Integer> filterEvents(String eventType, String granularity, long startTime, long endTime) {
		if (startTime > endTime) {
			throw new IllegalArgumentException("Invalid time range: start time must be less than end time");
		}
		
		Date start = new Date(startTime);
		int startHour = start.getHours();
		int startMin = start.getMinutes();
		long startHourMs = 60 * 60 * 1000 * startHour;
		long startMinMs = 60 * 1000 * startMin;
		long startDate = startTime - startHourMs - startMinMs;
		
		Date end = new Date(endTime);
		int endHour = end.getHours();
		int endMin = end.getMinutes();
		long endHourMs = 60 * 60 * 1000 * endHour;
		long endMinMs = 60 * 1000 * endMin;
		long endDate = endTime - endHourMs - endMinMs;
		
		long msToNextDay = 24 * 60 * 60 * 1000;
		long msToNextHour = 60 * 60 * 1000;
		long msToNextMin = 60 * 1000;
		
		HashMap<Long, Integer> results = new HashMap<Long, Integer>();
		
		switch (granularity) {
			case "days":
				SortedMap<Long, Stats> submap = tweets.subMap(startDate, endDate);
				int numIterations = 0;
				int index = (startHour * 60) + startMin;
				int sum = 0;
				for (long l : submap.keySet()) {
					Stats currentStats = submap.get(l);
					int[] minutes = currentStats.getTimeCount();
					while (index < minutes.length) {
						if (numIterations < 1440) {
							sum += minutes[index];
							index++;
							numIterations++;
						}
						else {
							results.put(l, sum);
							sum = 0;
							numIterations = 0;
						}
					}
					index = 0;
				}
				return results;	
			case "hours": 
			case "minutes":
			default:
				throw new IllegalArgumentException("Invalid granularity value: must be 1 of days, hours, or minutes");
		}
	}
	
	public static void main(String[] args) {
		long first = 1610870400000L;
		long second = 1610892000000L;
		long third = 1610978400000L;
		TweetEvents t = new TweetEvents();
		t.recordEntry("tweets", first);
		t.recordEntry("tweets", second);
		t.recordEntry("tweets", third);
		HashMap<Long, Integer> map = t.filterEvents("tweets", "days", 1610870400000L, 1611047160000L);
		System.out.println(map.toString());
	}
	

}
