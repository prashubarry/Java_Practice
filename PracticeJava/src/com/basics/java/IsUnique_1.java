package com.basics.java;
import java.io.*;

public class IsUnique_1 {
	static boolean isUniqueChars(String str) {
		if (str.length()>128) return false;
		boolean [] char_set = new boolean[128];
		
		for (int i = 0;i< str.length();i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val]=true;
		}
		return true;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String s = br.readLine();
			System.out.println(isUniqueChars(s));
		}
		
	}

}
