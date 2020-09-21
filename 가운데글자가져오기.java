package programers.ex;

public class 가운데글자가져오기 {

	
    public String solution(String s) {
/*
    	String answer = "";
        int n = s.length();
        
        if( n%2 == 0 ) { // 짝수
        	answer = s.substring(n/2-1, n/2+1);
        	
        } else { //홀수 
        	answer = Character.toString(s.charAt(n/2));
        }
        return answer;
*/      
    	return s.substring((s.length()-1) / 2, s.length()/2 + 1);
    }
	
	public static void main(String[] args) {
		가운데글자가져오기 x = new 가운데글자가져오기();
		
//		String str = "abcde";
		String str = "abcdef";
		System.out.println( x.solution(str) );				
	}
	
}
