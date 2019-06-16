package com.practice.java;
import java.util.*;
class Time2 {
	private int hour;
	private int minute;
	private int second;
	public Time2(int hour,int minute, int second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public int getSecond() {
		return this.second;
	}
}
class TimeComparator implements Comparator<Time2>{

	@Override
	public int compare(Time2 time1, Time2 time2) {
		// TODO Auto-generated method stub
		int hourDifference = time1.getHour() - time2.getHour();
		if (hourDifference!=0) {
			return hourDifference;
		}
		
		int minuteDifference = time1.getMinute() - time2.getMinute();
		if(minuteDifference!=0) {
			return minuteDifference;
		}
		
		int secondDifference = time1.getSecond() - time2.getSecond();
		return secondDifference;
	}
	
}
public class Sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Time2> list = new ArrayList<>();
		list.add(new Time2(6, 24, 34));
		list.add(new Time2(18, 14, 58));
		list.add(new Time2(6, 05, 34));
		list.add(new Time2(12, 14, 58));
		list.add(new Time2(6, 24, 22));
		
		System.out.printf("Unsorted Elements in Array:%n");
		for (Time2 t: list) {
			System.out.println(t.getHour()+":"+t.getMinute()+":"+t.getSecond());
		}
		
		Collections.sort(list, new TimeComparator());
		
		System.out.printf("Sorted Elemnts in the Array:%n");
		for (Time2 t: list) {
			System.out.println(t.getHour()+":"+t.getMinute()+":"+t.getSecond());
		}
	}

}
