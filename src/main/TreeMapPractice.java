package main;

import java.sql.Timestamp;
import java.sql.Date;
import java.util.*;

public class TreeMapPractice {
	
	private TreeMap<Pair<String, Integer>, Integer> tweets;
	private TreeMap<Long, HashMap<Long, Long>> retweets;
	private TreeMap<Long, HashMap<Long, Long>> likes;
	private TreeMap<Long, HashMap<Long, Long>> replies;
	
	public void recordEntry(String eventType, long timestamp) {
		switch (eventType){
			case "tweet":
			case "retweet":
			case "like":
			case "reply":
		}
			
				
		
	}
	
	public HashMap<Long, Integer> processQuery(String eventType, )
	
	public static void main(String[] args) {
		TreeMap<Long, Integer> t = new TreeMap<Long, Integer>();
		long time1 = Timestamp.valueOf("2021-01-01 00:00:00").getTime();
		long time2 = Timestamp.valueOf("2021-01-14 09:05:13").getTime();
		long time3 = Timestamp.valueOf("2021-01-10 12:30:47").getTime();
		t.put(time1, 1);
		t.put(time2, 2);
		t.put(time3, 3);
		
		for (Map.Entry entry : t.entrySet()) {
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}
	}
 

}
