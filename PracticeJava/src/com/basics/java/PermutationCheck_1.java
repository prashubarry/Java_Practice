package com.basics.java;
//import java.io.*;
import java.util.*;
public class PermutationCheck_1 {
	static String sort(String s) {
		char [] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	static boolean permutation(String s, String t) {
		if (s.length()!=t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "robe";
		String s2 = "bore";
		
		System.out.println(permutation(s1,s2));
		
	}

}
