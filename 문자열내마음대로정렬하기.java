package programers.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 문자열내마음대로정렬하기 {

	
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<String>();
        
        for( int i=0; i<strings.length; i++ ) {
        	String str = strings[i].charAt(n)+strings[i];
        	list.add( str );
        }
        Collections.sort(list);

        answer = new String[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i).substring(1);
        }
        return answer;
    }

/*	
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
        
        return answer;
    }
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		문자열내마음대로정렬하기 x = new 문자열내마음대로정렬하기();
		
		String[] strings1 = {"sun", "bed", "car"};
		int n1 = 1;
		System.out.println( Arrays.toString(x.solution(strings1, n1)) );
		
		String[] strings2 = {"abce", "abcd", "cdx"};
		int n2 = 2;
		System.out.println( Arrays.toString(x.solution(strings2, n2)) );
		
	}

}
