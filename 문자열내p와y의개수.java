package programers.ex;

public class 문자열내p와y의개수 {

    boolean solution(String s) {
        boolean answer = true;

        char[] cc = s.toLowerCase().toCharArray();
        
        int cnt = 0;
//        int cntY = 0;
        
        
        for( int i=0; i<cc.length; i++ ) {
        	if( cc[i] == 'p' || cc[i] == 'y' ) {
//        		++cntP;
        		++cnt;
        	}
//        	}else if( cc[i] == 'y' ) {
//        		++cntY;
//        	}else {
//        		
//        	}
        }
        
//        if( cntP == cntY ) {
//        	answer = true;
//        }else {
//        	answer = false;
//        }

//        return answer;
        	if(cnt % 2 == 0) answer = true;
        	else answer = false;
        	
//        	return answer;
        	return cnt % 2 == 0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		문자열내p와y의개수 x = new 문자열내p와y의개수();
		
		String s1 = "pPoooyY";
		System.out.println(x.solution(s1));
		
		String s2 = "Pyy";
		System.out.println(x.solution(s2));
		
	}

}
