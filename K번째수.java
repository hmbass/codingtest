package programers.ex;

import java.util.Arrays;

public class K번째수 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        for( int m=0; m<commands.length; m++ ) {
        	i = commands[m][0];
        	j = commands[m][1];
        	k = commands[m][2];

        	int[] tempArr = Arrays.copyOfRange(array, i-1, j);
        	Arrays.sort(tempArr);
        	
        	answer[m] = tempArr[k-1];
        }

        return answer;
    }
    
    public static void main(String[] args) {
	
    	K번째수 x = new K번째수();
    	
    	int[] array = { 1, 5, 2, 6, 3, 7, 4 };
    	int[][] commands = { {2, 5, 3}, {4, 4, 1}, {1, 7, 3} };  
    	
    	System.out.println(Arrays.toString(x.solution(array, commands))); //5,6,3
	}	
}
