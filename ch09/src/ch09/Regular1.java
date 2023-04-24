package ch09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular1 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "cA", "ca", "co", 
				"c.", "c0", "car", "combat", "count", "date", "disc"};
		//[] 대괄호 있는 것 중에 1개, * 안에 것이 반복, - 범위지정
		Pattern p = Pattern.compile("c[0a-z]"); //형식지정
		//c로 시작하는 소문자 영단어
		for(int i=0; i<data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches()) { //검색조건에 맞으면
				System.out.println(data[i]+",");
			}
		}
	}
}
