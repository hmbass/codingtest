package day2;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class TestSet1 {
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		set1.add("hong");
		set1.add("장길산");
		set1.add(new Date());
		
		System.out.println(set1);
		
		set1.add("장길산");
		System.out.println(set1);
		////////
		
//		Iterator iter = set1.iterator();
//		while( iter.hasNext() ) {
//			System.out.println((String)iter.next());
//		}
						
		////////	
		HashSet<String> set2 = new HashSet<String>();
		set2.add("aaaa");
		set2.add("bbbb");
//		set2.add(new Date());
		
		Iterator<String> iter2 = set2.iterator();
		while( iter2.hasNext() ) {
			System.out.println( iter2.next() );
		}
		
		Random r = new Random();
		
		
		
	}
}
