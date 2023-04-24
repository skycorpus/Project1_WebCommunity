package ch02;

public class Char1 {
	public static void main(String[] args) {
		// %c는 문자(하나), %s는 문자열, 작은 따옴표는 문자 하나''
		//큰 따옴표는 문자열 문자 여러 개 
		System.out.printf("문자 %c의 유니코드 %d\n", 'A', (int)'A');
		System.out.printf("문자 %c의 유니코드 %d\n", 'a', (int)'a');
		System.out.printf("문자 %c의 유니코드 %d\n", '0', (int)'0');
		System.out.printf("문자 %c의 유니코드 %d\n", 'A'+1, (int)'A'+1);
	}
}
