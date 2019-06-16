package com.basics.java;
import java.io.*;
import java.math.*;
public class ReverseArray {
	static void reverse(int [] a,int n,int k) {
		int i,left,right;
		i=0;
		while (i<n) {
			left = i;
			right = Math.min(i+k-1,n-1);
			int temp;
			while(left<right) {
				temp = a[left];
				a[left]=a[right];
				a[right]=temp;
				left+=1;
				right-=1;
			}
		}
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String [] nq = br.readLine().split("\\s");
			int N = Integer.parseInt(nq[0]);
			int K = Integer.parseInt(nq[1]);
			String [] line = br.readLine().split("\\s");
			
			int [] A = new int [N+1];
			int i = 0;
			
			for (int n = 0; n<N; i++) {
				A[i++] = Integer.parseInt(line[n]);
			}
			
			reverse(A,N,K);
			for (int j = 0; j<N; j++) {
				System.out.println(A[j]+" ");
			}
				
			
		
			
		}
	}

}
