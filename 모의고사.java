package programers.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 모의고사 {
	
    public int[] solution(int[] answers) {
        int[] answer = {};

        // 1. 수포자 1,2,3을 정의 
        // 2. 정답 준비
        // 3. 수포자 1,2,3과 정답을 비교 = for, if 동시 비교 ==> 맞으면 + 1(cnt)
        // 4. 제일 잘본 사람(정렬)
        
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        List<Integer> list = new ArrayList<Integer>();
        
        for( int i=0; i<3; i++ ) {
        	list.add(0);
        }
        
        // 3. 정답확인
        for( int i=0; i<answers.length; i++ ) {
        	if( answers[i] == supo1[i%supo1.length] ) {
        		list.set(0, list.get(0)+1);
        	}
        	if( answers[i] == supo2[i%supo2.length] ) {
        		list.set(1, list.get(1)+1);
        	}
        	if( answers[i] == supo3[i%supo3.length] ) {
        		list.set(2, list.get(2)+1);
        	}
        }
        
        int max = Collections.max(list);
        
        List<Integer> rList = new ArrayList<Integer>();
        for( int i=0; i<list.size(); i++ ) {
        	if( max == list.get(i)) {
        		rList.add(i+1);
        		
        	}
        }
        
        answer = new int[rList.size()];
        for( int i=0; i<rList.size(); i++ ) {
        	answer[i] = rList.get(i);
        }

        return answer;
    }
    
    public static void main(String[] args) {
		
    	모의고사 x = new 모의고사();
    	int[] nArr = {1,2,3,4,5};
    	System.out.println( Arrays.toString(x.solution(nArr)) );
    	
    	int[] nArr2 = {1,3,2,4,2};
    	System.out.println( Arrays.toString(x.solution(nArr2)) );
    	
    	int[] nArr3 = {1,2,3,4,5,1,2};
    	System.out.println( Arrays.toString(x.solution(nArr3)) );
    }
}

//answers		return
//[1,2,3,4,5]	[1]
//[1,3,2,4,2]	[1,2,3]


/*

import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        return list.stream().mapToInt(i->i.intValue()).toArray();
    }
}

*/