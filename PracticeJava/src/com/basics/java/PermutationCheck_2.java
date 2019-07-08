package com.basics.java;
//import java.io.*;
//import java.util.*;
public class PermutationCheck_2 {
	static boolean permutation(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		char [] s_array = s.toCharArray();
		int [] letter = new int[128];
		for (char c : s_array) {
			letter[c]++;
		}
		for (int i = 0; i<t.length();i++) {
			int c = (int)t.charAt(i);
			letter[c]--;
			if (letter[c]<0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "robe";
		String s2 = "bord";
		System.out.println(permutation(s1,s2));
	}

}
