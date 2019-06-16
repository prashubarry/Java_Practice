package com.practice.java;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Arrays;

public class Sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collections method sort.
		String [] suits = {"Heart","Spade","Diamonds","Clubs"};
		
		//Create and display the list containing the suits string
		List<String> list = Arrays.asList(suits);
		System.out.printf("Unsorted elemnts: %s%n", list);
		
		//Sorting the elements using the Collections sort method
		Collections.sort(list);
		System.out.printf("Sorted elemnts: %s%n", list);
		
		//Sorting List in reverse Order
		Collections.sort(list,Collections.reverseOrder());
		System.out.printf("Sorted elemnts(Descending): %s%n", list);
		
	}

}
