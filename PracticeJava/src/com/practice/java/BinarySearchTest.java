package com.practice.java;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class BinarySearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array list from the arrays of the content colors
		String [] colors = {"red","white","blue","black","yellow","purple","tan","pink"};
		List<String> list = Arrays.asList(colors);
		Collections.sort(list);
		System.out.printf("Sorted Array List: %s%n",list);
		//search list of various values
		printSearchResult(list,"black");
		printSearchResult(list,"red");
		printSearchResult(list,"pink");
		printSearchResult(list,"aqua");
		printSearchResult(list,"gray");
		printSearchResult(list,"teal");
		
	}
	public static void printSearchResult(List<String> index,String key) {
		int result = Collections.binarySearch(index,key);
		if (result >= 0) {
			System.out.printf("Found at index: %d%n", result);
		}
		else {
			System.out.printf("Not found (%d)%n",result);
		}
	}

}
