package com.practice.java;
import java.util.PriorityQueue;
public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//queue of capacity 11
		PriorityQueue<Double> queue = new PriorityQueue<>();
		//inserts elements into the queue
		queue.offer(3.2);
		queue.offer(9.8);
		queue.offer(5.4);
		
		//Poll the elements in the PriorityQueue
		System.out.println("Polling from queue:");
		//display elements in queue
		while(queue.size()>0) {
			System.out.printf("%.1f ",queue.peek());
			queue.poll();//remove top element
		}
	}

}
