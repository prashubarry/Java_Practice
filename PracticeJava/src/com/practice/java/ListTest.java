package com.practice.java;
//Import packaes required for ding the below tasks
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListTest {
	static void printList(List<String> list) {
		System.out.printf("%nOriginal List:%n");
		for(String color:list) {
			System.out.printf("%s ",color);
		}
		System.out.println();
	}
	private static void convertToUpperCase(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			String color=iterator.next();
			iterator.set(color.toUpperCase());//Task3 complete
		}
		
	}
	private static void printReverseOrder(List<String> list) {
		ListIterator<String> iterator = list.listIterator(list.size());
		
		System.out.printf("%nReversed List:%n");
		while(iterator.hasPrevious()) {
			System.out.printf("%s ",iterator.previous());
		}
	}
	private static void removeElements(List<String> list,int start,int end) {
		list.subList(start, end).clear();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.Create two linked lists of String
		 * 2.Concatenate the list2 to list1
		 * 3.Convert all the strings to uppercase
		 * 4.Delete string from a specified range
		 * 5.print list in reverse order*/
		
		String [] colors = {"black","yellow","green","blue","violet","silver"};
		List<String> list1 = new LinkedList<>();
		
		for (String color: colors) {
			list1.add(color);
		}
		
		String [] colors2 = {"gold","white","brown","blue","gray","silver"};
		List<String> list2 = new LinkedList<>();
		
		for (String color2: colors2) {
			list2.add(color2);
		}
		//Task1 complete
		
		//addAll() method concatenate one list to another
		list1.addAll(list2);
		list2=null;
		//Print the concatenated List (Task2 Complete)
		printList(list1);
		//Task3 Convert to Upper Case
		convertToUpperCase(list1);
		printList(list1);
		//Task4 Delete elements from the list
		System.out.printf("%nDeleting elements 4 to 6 ...");
		removeElements(list1, 4, 6);
		printList(list1);
		//Task5 Reverse the list
		printReverseOrder(list1);
	}

}
