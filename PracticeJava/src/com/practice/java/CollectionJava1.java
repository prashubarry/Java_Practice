package com.practice.java;
import java.util.*;
public class CollectionJava1 {
	private static void removeColors(Collection <String> collection1, Collection<String> collection2) {
		//get iterator
		Iterator <String> iterator = collection1.iterator();
		
		//loop while collection1 has items
		while(iterator.hasNext()) {
			if(collection2.contains(iterator.next())) {
				iterator.remove();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array for colors
		String [] colors = {"MAGENTA","RED","WHITE","BLUE","CYAN"};
		List<String> list = new ArrayList<String>();
		for (String color: colors) {
			list.add(color);
		}
		//array for removing colors
		String [] removeColors = {"RED","WHITE","BLUE"};
		List<String> list1 = new ArrayList<String>();
		
		for(String color: removeColors) {
			list1.add(color);
		}
		//output list contents
		System.out.println("Array List:");
		for (int count = 0; count < list.size(); count++) {
			System.out.printf("%s ", list.get(count));
		}
		
		removeColors(list,list1);
		
		//Output List contents
		System.out.printf("%n%nArray List after calling removeColors:%n");
		for(String color: list) {
			System.out.printf("%s ", color);
		}
	}

}
