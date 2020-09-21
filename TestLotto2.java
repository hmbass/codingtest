package day2;

import java.util.Random;
import java.util.TreeSet;

public class TestLotto2 {
	public static void main(String[] args) {

		TreeSet<Integer> lotto = null;
		Random r = new Random();
		
		int cnt = 0;
		while( cnt < 5 ) {
			lotto = new TreeSet<Integer>();

			// 번호 6개
			while( lotto.size() < 6 ) {
				int x = r.nextInt(45)+1;
				lotto.add(x);
			}
			
			
			
			int tot = 0;
			for( int i : lotto ) {
				tot += i;
			}
			
			if( tot >= 100 && tot <= 170 ) {
				System.out.println( lotto  + ":\t" + tot);
				cnt++;
			}
		}
	}
}

//문제이해
//플랜
//테스트
//회고
