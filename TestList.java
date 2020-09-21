package day2;

import java.util.ArrayList;

public class TestList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		
		System.out.println( list.size() );
		System.out.println( list );
		for( String str : list ) {
			System.out.println( str );
		}
		
		
	}
}
