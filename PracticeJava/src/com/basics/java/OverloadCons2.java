package com.basics.java;
import java.io.*;
class Box{
	double width;
	double height;
	double length;
	/*Constructor which takes a object parameter*/
	Box(Box ob){
		width = ob.width;
		height= ob.height;
		length= ob.length;
	}
	/*Constructor when all dimensions are specified*/
	Box(double w,double h,double l ){
		width = w;
		height = h;
		length = l;
	}
	/*Constructor when no dimensions specified*/
	Box(){
		width = -1;
		height = -1;
		length = -1;
	}
	/*Constructor when cube is defined*/
	Box(double l){
		width = height =length = l;
	}
	/*Compute the volume of the box*/
	double volume() {
		return width*height*length;
	}
	
}
public class OverloadCons2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String [] nq = br.readLine().split("\\s");
			
			int N = Integer.parseInt(nq[0]);
			
			String [] line = br.readLine().split("\\s");
			
			int [] A = new int[N+1];
			int i = 0;
			
			for (int n = 0; n < N; n++) {
				A[i++] = Integer.parseInt(line[n]);
			}
			
			Box mybox1= new Box(A[0],A[1],A[2]);
			Box mybox2= new Box();
			Box myclone = new Box(mybox1);
			Box mycube = new Box(A[2]);
			
			System.out.println(mybox1.volume());
			System.out.println(mybox2.volume());
			System.out.println(myclone.volume());
			System.out.println(mycube.volume());
			
			
		}
	}

}
