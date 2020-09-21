package programers.ex;

import java.util.HashMap;

public class 완주하지못한선수 {

	
	public static void main(String[] args) {
		
		완주하지못한선수 x = new 완주하지못한선수();
		
		String[] participant = {"leo", "kiki", "eden", "leo"};
		String[] completion = {"eden", "kiki"};
	
		String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
		
		String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
		String[] completion3 = {"stanko", "ana", "mislav"};
		
		
		
		System.out.println( x.solution(participant, completion) );
		System.out.println( x.solution(participant2, completion2) );
		System.out.println( x.solution(participant3, completion3) );

	}

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String key : participant) {
			map.put(key, map.getOrDefault(key, 0)+1);
		}		
		System.out.println("참여자\t" + map);
		
		for (String key : completion) {
			map.put(key, map.get(key)-1);
		}
		
		for (String key : map.keySet()) {
			if( map.get(key) > 0 ) {
				answer = key;
			}
		}		
		return answer;
	}
}

/*
participant	completion	return
[leo, kiki, eden]	[eden, kiki]	leo
[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
[mislav, stanko, mislav, ana]	[stanko, ana, mislav]
*/