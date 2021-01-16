package main;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TweetEvents {
	
	private String timestamp;
	private int count;
	
	
	private TreeMap<TweetEvents, TreeMap<int[], int[]>> tweets;
	private TreeMap<TweetEvents, TreeMap<int[], int[]>> retweets;
	private TreeMap<TweetEvents, TreeMap<int[], int[]>> likes;
	private TreeMap<TweetEvents, TreeMap<int[], int[]>> replies;
	
	public TweetEvents(String t, int c) {
		this.timestamp = t;
		this.count = c;
	}
	
	public String getTimestamp() {
		return this.timestamp;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void recordEntry(String eventType, long timestamp) {
		Date d = new Date(timestamp);
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int date = d.getDate();
		String fullDate = year + "-" + month + "-" + date;
		
		int hours = d.getHours();
		int minutes = d.getMinutes();
		
		switch (eventType){
			case "tweet":
			case "retweet":
			case "like":
			case "reply":
				
			default:
				throw new IllegalArgumentException("Invalid event type");
		}
		
	}
	
	public HashMap<Long, Integer> getEventCounts(String eventType, long start, long end, String granularity) {
		if (end <= start) {
			throw new IllegalArgumentException("End timestamp must proceed start timestamp");
		}
		// TODO
		return null;
	}
	

}
