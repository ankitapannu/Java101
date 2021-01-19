package main;

public class Stats {
	
	private int dayCount;
	private int[] timeCount;
	
	public Stats () {
		dayCount = 0;
		timeCount = new int[1440];
	}
	
	public void addEvent(int hour, int min) {
		this.dayCount++;
		int index = (hour * 60) + min;
		this.timeCount[index] += 1; 
	}
	
	public int getDayCount() {
		return this.dayCount;
	}
	
	public int[] getTimeCount() {
		return this.timeCount;
	}

}
