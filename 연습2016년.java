package programers.ex;

import java.time.LocalDate;

public class 연습2016년 {

    public String solution(int a, int b) {
        String answer = "";

        LocalDate localDate = LocalDate.of(2016, a, b);
        answer = localDate.getDayOfWeek().toString().substring(0, 3);
             
        
        return answer;
    }	
	
	public static void main(String[] args) {
	
		연습2016년 x = new 연습2016년();
		int a = 5;
		int b = 24;
		
		System.out.println( x.solution(a, b) );
		
	}	
}
