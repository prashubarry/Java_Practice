package com.basics.java;
import java.io.*;
public class IsUnique_2 {
	static boolean isUniqueChars(String str) {
		int checker=0;
		for (int i = 0;i<str.length();i++) {
			int val = str.charAt(i)-'a';
			if ((checker & (1<<val))>0) {
				return false;
			}
			checker|=(1<<val);
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String s = br.readLine();
			System.out.println(isUniqueChars(s));
		}
	}

}
