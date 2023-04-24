package ch02;

public class String1 {
	public static void main(String[] args) {
		String s1 = "대박"; //기본형처럼 사용
		String s2 = new String("사건"); //참조형으로 사용
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		//문자열 + 문자열 => 문자열 형식
		System.out.println("s1 +s2 = "+ s1 + s2);
	}
}
