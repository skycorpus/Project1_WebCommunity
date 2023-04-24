package prac0406;


import java.util.Scanner;

//@SuppressWarnings("serial") //방법1: 어노테이션 이용해 경고 끄기.
class ReadAgeException extends Exception {
	private static final long serialVersionUID = 1L; //방법2: 디폴트 serialVersionUID 생성.

//사용자 정의 예외
	public ReadAgeException() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}

public class MyExceptionClass {
	public static void main(String[] args) {
		System.out.println("나이입력: ");
		try {
			int age = readAge();
			System.out.printf("입력된 나이: %d \n", age);
		}
		catch(ReadAgeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int readAge() throws ReadAgeException { //어떤 타입의 예외를 던지는 메소드인지 표기.
		try (Scanner kb = new Scanner(System.in)) {
			int age = kb.nextInt();
			
			if(age < 0) //나이가 음수로 입력되면
				throw new ReadAgeException(); //예외 상황에서 예외를 생성해 던지기.
			
			return age;
		}
	}
}
