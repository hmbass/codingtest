package programers.ex;

public class 두정수사이의합 {
	
    public long solution(int a, int b) {
        long answer = 0;
        
        if( a == b ) {
        	return a;
        }
        int temp = 0;
        if( a > b ) {
        	temp = a;
        	a = b;
        	b = temp;
        }
        for( int i=a; i<=b; i++ ) {
        	answer += i;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		두정수사이의합 x = new 두정수사이의합();
		
		int a1 = 3, b1 = 5;
		System.out.println( x.solution(a1, b1) );
		
		int a2 = 3, b2 = 3;
		System.out.println( x.solution(a2, b2) );
		
		int a3 = 5, b3 = 3;
		System.out.println( x.solution(a3, b3) );
		
		int a4 = 1, b4 = 10;
		System.out.println( x.solution(a4, b4) );
	}

}
