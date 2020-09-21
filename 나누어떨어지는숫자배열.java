package programers.ex;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
	
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(arr);
        for( int n : arr ) {
        	
        	if( n % divisor == 0 ) {
        		list.add(n);
        	}
        }
        
        if( list.isEmpty() ) {
        	list.add(-1);
        }
        
        answer = new int[list.size()];
        for( int i = 0; i<list.size(); i++ ) {
        	answer[i] = list.get(i);
        }
      
        return answer;
    }
	
	public static void main(String[] args) {

		나누어떨어지는숫자배열 x = new 나누어떨어지는숫자배열();
		
		int[] arr1 = {5,9,7,10};
		int divisor1 = 5;
		System.out.println( Arrays.toString(x.solution(arr1, divisor1)) );
		
		int[] arr2 = {2,36,1,3};
		int divisor2 = 1;
		System.out.println( Arrays.toString(x.solution(arr2, divisor2)) );
		
		int[] arr3 = {3,2,6};
		int divisor3 = 10;
		System.out.println( Arrays.toString(x.solution(arr3, divisor3)) );
		
		
	}
	
}
