package programers.ex;

import java.util.ArrayList;
import java.util.Arrays;

public class 같은숫자는싫어 {

	
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        
        for( int i=0; i<arr.length-1; i++ ) {
        	
        	if( arr[i] != arr[i+1] ) {
        		list.add(arr[i+1]);
        	}
        }
        
        // java8 lamda
//        answer = list.stream().mapToInt(i->i).toArray();
        
        answer = new int[list.size()];
        for( int i = 0; i<list.size(); i++ ) {
        	answer[i] = list.get(i);
        }        
        return answer;
    }
    
    public static void main(String[] args) {
    	같은숫자는싫어 x = new 같은숫자는싫어();
    
//    	int[] dataList = {1,1,3,3,0,1,1};
    	int[] dataList = {4,4,4,3};
    	System.out.println( Arrays.toString(x.solution(dataList)) );
	}
}
