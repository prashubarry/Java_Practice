package com.practice.java;
import java.util.*;
public class Algorithm1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character [] letters = {'P','C','M'};
		List<Character> list = Arrays.asList(letters);
		
		System.out.println("List contains: ");
		output(list);
		//Reverse the list
		System.out.printf("%nAfter calling reverse List, it contains :");
		Collections.reverse(list);
		output(list);
		//Create copyList from array of 3 characters
		Character [] letterCopy = new Character[3];
		List<Character> copyList = Arrays.asList(letterCopy);
		Collections.copy(copyList,list);
		System.out.printf("%nAfter calling copyList, it contains :");
		output(copyList);
		//file list with R's
		Collections.fill(list,'R');
		System.out.printf("%nAfter calling fill, list contains:%n");
		output(list);
		
	}
	//output List Information
	public static void output(List <Character> listRef) {
		System.out.print("The list is: ");
		for (Character element: listRef) {
			System.out.printf("%s ",element);
		}
		System.out.printf("%nMax: %s",Collections.max(listRef));
		System.out.printf("%nMin: %s",Collections.min(listRef));
	}

}
