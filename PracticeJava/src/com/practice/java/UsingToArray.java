package com.practice.java;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
public class UsingToArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Viewing Arrays as list and then coverting the same back to array
		String [] colors = {"black","blue","yellow"};
		List<String> link = new LinkedList<>(Arrays.asList(colors));
		
		link.add("red");//add value "red" to the last
		link.add("pink");//add to the end of the list
		link.add(3,"green");//add to the index 3 from the end
		link.add(0,"cyan");//add at index start
		
		colors = link.toArray(new String[link.size()]);
		System.out.println("Colors:");
		for(String color: colors) {
			System.out.println(color);
		}
		
	}

}
