package ch02;

/*작성자: 손지현
작성일: 2023.02.16
제목: */
public class Logical2 {
	public static void main(String[] args) {
		boolean b1 = 5 > 3, b2 = 5 < 3, b3 = 5 == 3, b4 = 5 != 3; // != 같지않다
		System.out.println("b1 = " + b1); // true
		System.out.println("b2 = " + b2); // false
		System.out.println("b3 = " + b3); // false
		System.out.println("b4 = " + b4); // true

		System.out.printf("\n");
		System.out.printf("b1&&b2 = "); // t && f => f
		System.out.println(b1 && b2);
		System.out.printf("b1||b2 = "); // t || f => f
		System.out.println(b1 || b2);
		System.out.printf("b1&&b3 = "); // t && f => f
		System.out.println(b1 && b3);
		System.out.printf("b1||b4 = "); // t || t => t
		System.out.println(b1 || b4);
		System.out.printf("b2&&b4 = "); // f && t => f
		System.out.println(b2 && b4);
		System.out.printf("b2||b4 = "); // f || t => t
		System.out.println(b2 || b4);
		System.out.printf("b2&&b3 = "); // f && f => f
		System.out.println(b2 && b3);
		System.out.printf("b2||b3 = "); // f || f => f
		System.out.println(b2 || b3);
		System.out.printf("b3&&b4 = "); // f && t => f
		System.out.println(b3 && b4);
		System.out.printf("b3||b4 = "); // f || t => t
		System.out.println(b3 || b4);

		System.out.printf("\n");
		System.out.println("b1&&b2 = " + (b1 && b2)); // 연산식엔 괄호 씌워주기.
	}
}
