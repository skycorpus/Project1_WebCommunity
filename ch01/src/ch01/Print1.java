package ch01;

public class Print1 {
	public static void main(String[] args) {
		System.out.println("대박"); //ln은 출력한 후에 줄바꿈
		System.out.println("사건");
		System.out.print("대박"); 
		System.out.println("사건");
//		f는 format (형식)의 약자 %s는 string의 약자로 문자열, %d는 decimal의 약자 정수
		System.out.printf("%s : %d원", "가격", 800);
	}
}
