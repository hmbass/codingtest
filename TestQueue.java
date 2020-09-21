package day2;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		
		queue.add("1_aaaa");
		queue.add("2_bbbb");
		queue.add("3_cccc");
		
		System.out.println( queue );
		
		while( !queue.isEmpty() ) {
			
			System.out.println( queue.poll() );
			
		}

		
		
	}
}
