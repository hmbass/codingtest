package day2;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack stack = new Stack<String>();
		stack.add("1_aaaa");
		stack.add("2_bbbb");
		stack.add("3_cccc");
		
		System.out.println( stack );
		
		while( !stack.isEmpty() ) {
			System.out.println( stack.pop() );
		}		
	}
}
