package ch11;

import java.util.Arrays;

public class Arrays3 {
	public static void main(String[] args) {
		Integer[] scores = {99,97,98,88,77};
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		//binarySearch 메서드를 사용할 때는 반드시 sort를 해야 한다.
		int index = Arrays.binarySearch(scores, 97);
		System.out.println("찾은 인덱스 : "+index);
		String[] name = {"제니", "로제", "뉴진스", "방탄소년단", "블랙핑크"};
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		index = Arrays.binarySearch(name, "뉴진스");
		System.out.println("찾은 인덱스 : "+index);
		System.out.println();
		
		//객체를 정렬하고 찾기.
		System.out.println("<객체를 정렬하고 찾기>");
		Member1 m1 = new Member1("제니");
		Member1 m2 = new Member1("로제");
		Member1 m3 = new Member1("뉴진스");
		Member1 m4 = new Member1("박보검");
		Member1[] members = {m1, m2, m3, m4};
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		
		index = Arrays.binarySearch(members, m2);
		System.out.println("찾은 인덱스 : "+index);
	}
}
