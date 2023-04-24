package prac0406;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {
		try (Scanner kb = new Scanner(System.in)) {
			try {
				System.out.print("a?");
				int n1 = kb.nextInt();
				System.out.print("b?");
				int n2 = kb.nextInt();
				System.out.printf("%d / %d = %d\n", n1, n2, n1/n2);
			}
			catch(ArithmeticException | InputMismatchException e) { 
				//서로 다른 예외를 한번에 처리. |: 또는
				System.out.println(e.getMessage());
				//e: 예외객체, getMessage: 예외 메시지의 getter.
			}
			//예외 클래스의 상속관계에서 위쪽에 더 하위 예외클래스에 대한 catch 구문을 작성.
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
