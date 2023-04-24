package ch11;

import java.util.Arrays;
import java.util.Collections;

public class Arrays2 {
	public static void main(String[] args) {
		Integer[] score = {43,98,56,78,34};
		System.out.println("배열 : "+Arrays.toString(score));
		
		Arrays.sort(score); //오름차순 정렬.
		System.out.println("오름차순 : "+Arrays.toString(score));
		
		Arrays.sort(score, Collections.reverseOrder()); //내림차순 정렬.
		System.out.println("내림차순 : "+Arrays.toString(score));
		System.out.println();
		
		String[] name = {"제니", "로제", "뉴진스", "방탄소년단", "블랙핑크"};
		System.out.println("배열 : "+Arrays.toString(name));
		Arrays.sort(name);
		System.out.println("오름차순 : "+Arrays.toString(name));
		Arrays.sort(name, Collections.reverseOrder());
		System.out.println("내림차순 : "+Arrays.toString(name));
	}
}
