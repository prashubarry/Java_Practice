package com.practice.java;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import java.util.List;
import java.util.Arrays;

public class SetTest {
	private static void printNonDuplicates(Collection <String> values) {
		//create a set-- Here hashset are unordered in nature.
		Set<String> set = new HashSet<>(values);
		System.out.printf("%nNon Duplicates are:");
		
		for(String value: set ) {
			System.out.printf("%s ", value);
		}
		System.out.println();
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create and display a list string
		String [] colors = {"red","white","blue","green","gray","orange","white","tan","white","cyan","peach","gray","orange"};
		List<String> list = Arrays.asList(colors);
		System.out.printf("List: %s%n",list);
		
		//eliminate duplicates then print unique values
		printNonDuplicates(list);
	}

}
