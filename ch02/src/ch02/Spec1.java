package ch02;

public class Spec1 {
	public static void main(String[] args) {
		// \t는 tab
		System.out.println("대\t박\t사\t건");
		// \n은 줄바꿈(new line), \r 커서를 맨 앞으로(carriage return)
		// \r\n은 enter
		System.out.println("대박\n사\r건");
		// "을 출력할 때 \는 뒤에 있는 "는 문자열 종료가 아니라 "라는 문자라는 뜻이다.
		System.out.println("\"");
		System.out.println("'");
		// \뒤에 있는 \는 문자 자체이다.
		System.out.println("\\");
	}
}
