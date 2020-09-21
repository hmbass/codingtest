package day2;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class TestLotto {
	
	public static void main(String[] args) {
		
/*		
        Random rd = new Random();//랜덤 객체 생성
       
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i=0;i<6;i++) {
//            System.out.print("["+(rd.nextInt(45)+1)+"]");
        	set.add(rd.nextInt(45)+1);
        }
        
        Iterator<Integer> iter = null;
        iter = set.iterator();
		while( iter.hasNext() ) {
			System.out.printf("%4d", iter.next() );
		}
*/
		// 1. 1~45 난수
		Random random = new Random();
		
		TreeSet<Integer> set = null;
		Iterator<Integer> iter = null;
		
		// 4. 5
		for( int i=0; i<5; i++ ) {
			int num = 0;
			set = new TreeSet<Integer>();
			int tot = 0;
			
			// 5. 로또의 합이 100~170
			while( tot >= 100 && tot <= 170 ) {

				// 2. 중복없이 6개
				// 3. 정렬
				while( set.size() == 6 ) {
					set.add(random.nextInt(45)+1);
				}
				
				iter = set.iterator();
				while( iter.hasNext() ) {
					num = iter.next();
					tot += num;
					System.out.println( num );
				}
				set.clear();
			}
			while( iter.hasNext() ) {
				System.out.printf("%4d", iter.next() );
			}
			System.out.println();
		}
	}
}
