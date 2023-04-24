package ch06;

public class Single1Ex {
	public static void main(String[] args) {
		//객체를 출력 패키지명.클래스명@해시코드(=주소)
		Single1 p1 = new Single1();
		Single1 p2 = new Single1();
		Single1 p3 = new Single1();
		System.out.println(p1);System.out.println(p2);System.out.println(p3);
		System.out.println("=================");
		
		//객체이름은 다르지만 주소가 같다.
		Single1 s1 = Single1.getInstance(); //private에 getInstance()를 통해 접근하여 생성
		Single1 s2 = Single1.getInstance(); //하나만 생성되어서 같은 주소값이 나옴.
		Single1 s3 = Single1.getInstance(); //하나만 생성되어서 같은 주소값이 나옴.
		System.out.println(s1); System.out.println(s2); System.out.println(s3); //주소값이 찍힌다.
	}
}
