package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		HashMap<String, String> fruits = new HashMap<>();
		fruits.put("딸기", "달콤하다."); // put(key, value);
		fruits.put("수박", "시원하다.");
		fruits.put("키위", "새콤하다.");
		
		Set<String> keys = fruits.keySet(); //Set 사용
		for(String key : keys) { //확장 for문
			System.out.println(fruits.get(key));
		}
		System.out.println("==================");
		Iterator<String> it = fruits.keySet().iterator(); //Iterator 사용
		while(it.hasNext()) { //while문
			String key = it.next();
			System.out.println(key+"는 "+fruits.get(key));
		}
	}
}

