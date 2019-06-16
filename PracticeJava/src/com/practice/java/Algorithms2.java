package com.practice.java;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Algorithms2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implementing the collections method addAll, frequency and disjoint
		//Initialize list1 and list2
		String [] color = {"red","white","yellow","blue"};
		List<String>list1 = Arrays.asList(color);
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("black");
		list2.add("red");
		list2.add("green");
		System.out.println("Before addAll, list1 contains:");
		
		for (String s:list2) {
			System.out.printf("%s ",s);
		}
		
		Collections.addAll(list2,color);
		
		System.out.printf("%nAfter addAll, list contains: %n");
		for (String s :list2) {
			System.out.printf("%s ",s);
		}
	
		//get the frequency of red
		int frequency = Collections.frequency(list2,"red");
		System.out.printf("%nFrequency of red in the list: %d%n",frequency);
		
		//check whether list1 and list2 have elements in common
		boolean disjoint = Collections.disjoint(list1,list2);
		System.out.printf("list1 and list2 %s elements in common%n",(disjoint ? "do not have ":"have "));
		
	}

}
