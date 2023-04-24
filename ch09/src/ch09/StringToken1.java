package ch09;

import java.util.StringTokenizer;

public class StringToken1 {
	public static void main(String[] args) {
		                                        //문자열             delimiter
		StringTokenizer st = new StringTokenizer("사과,바나나,딸기,포도",",");
		while(st.hasMoreTokens()) { //토큰이 있으면 (데이터가 있으면)
			System.out.println(st.nextToken());
		}
	}
}

