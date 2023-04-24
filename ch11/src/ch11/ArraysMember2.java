package ch11;

import java.util.Arrays;
import java.util.Collections;

public class ArraysMember2 {
	public static void main(String[] args) {
		Member2 m1 = new Member2("하니", 15);
		Member2 m2 = new Member2("로제", 27);
		Member2 m3 = new Member2("보검", 31);
		Member2 m4 = new Member2("제니", 25);
		Member2 m5 = new Member2("은우", 32);
		Member2[] members = {m1, m2, m3, m4, m5};
		
		System.out.println("배열 : "+Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("오름차순 : "+Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println("내림차순 : "+Arrays.toString(members));
	}
}
