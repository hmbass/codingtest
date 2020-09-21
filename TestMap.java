package day2;

import java.util.HashMap;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("aaaa", 22);
		map.put("bbbb", 2345);
		map.put("cccc", 2346);
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.get("aaaa"));
		
		
		
	}

}
