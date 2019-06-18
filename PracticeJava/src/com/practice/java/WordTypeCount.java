package com.practice.java;
//Program counts the number of occurences of each word in a String.
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class WordTypeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create HashMap to store String keys and Integer Values
		Map<String,Integer> myMap = new HashMap<>();
		createMap(myMap);//create map based on user input
		displayMap(myMap);//display Map content
	}
	private static void createMap(Map<String,Integer> map) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = sc.nextLine();
		//tokenize the input i.e split the given string with the sapce in between
		String [] tokens = input.split(" ");
		
		//now create a map of word and count of each word.
		for (String token: tokens) {
			//convert all the words to lower case
			String word = token.toLowerCase();
			
			if (map.containsKey(word)) {//check if the word is on the map
				int count = map.get(word);//get current count
				map.put(word,count);
			}
			else {
				map.put(word,1);//if it is the first word in the map
			}
		}
	}
	//display the map content
	private static void displayMap(Map<String,Integer> map) {
		//get the keys
		Set<String> keys = map.keySet();
		
		//sort the keys
		TreeSet<String> sortedKey = new TreeSet<>(keys);
		
		//Print the map contents
		System.out.printf("%nMap contains:%nKey\t\tValue%n");
		
		//generate output for each key in the map
		for (String s: sortedKey) {
			System.out.printf("%-10s%10s%n",s,map.get(s));
		}
		System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(),map.isEmpty());
	}

}
