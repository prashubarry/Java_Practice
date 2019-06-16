package com.practice.java;
//Using SortedSetes and TreeSets
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
public class SortedSetTest {
	private static void printSet(SortedSet<String> set) {
		for(String s: set) {
			System.out.printf("%s ",s);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a tree set from array colors
		String [] colors = {"yellow","green","black","tan","grey","white","orange","red","green"};
		SortedSet <String> tree = new TreeSet<>(Arrays.asList(colors));
		
		System.out.print("Sorted Set:");
		printSet(tree);
		
		//get headSet based on "orange"
		System.out.print("headset {\"orange\"):");
		printSet(tree.headSet("orange"));
		
		//get tailSet based on "orange"
		System.out.print("tailset {\"orange\"}:");
		printSet(tree.tailSet("orange"));
		
		//get first and last elements
		System.out.printf("First: %s%n",tree.first());
		System.out.printf("Last: %s%n", tree.last());
	}

}
