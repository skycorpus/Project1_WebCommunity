package ch09;

import java.util.Scanner;

public class Except2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		while(true) {
			System.out.println("첫 번째 숫자를 입력하세요.");
			String str = sc.nextLine();
			if(str.equals("x")) break;
			try {
				num1 = Integer.parseInt(str);
				System.out.println("두 번째 숫자를 입력하세요.");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.printf("%d /%d = %d\n", num1, num2, num1/num2);
			}catch(ArithmeticException e) { //0으로 나누는 경우
				System.out.println("0으로 나눌 수 없습니다.");
			}
			catch(NumberFormatException e) {//문자열을 숫자로 바꾸려할 때
				System.out.println("숫자가 아닙니다.");
			}
			catch(Exception e) { //기타 에러 //범위가 넓은 것은 뒤에 배치를 권장
				System.out.println(e.getMessage());
			}
			finally { //예외 여부와 관계없이 무조건 실행하는 명령어
				System.out.println("무조건 실행");
			}
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
}
