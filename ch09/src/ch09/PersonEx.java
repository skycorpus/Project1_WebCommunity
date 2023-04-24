package ch09;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 1111);
		Person p2 = new Person("홍길동", 1122);
		//if (p1 == p2) System.out.println("같다");
		if (p1.equals(p2)) System.out.println("같다");
		else System.out.println("다르다");
		System.out.println(p1);//객체를 출력하면 패키지명.클래스명@해시코드(메모리에 있는 주소)
		System.out.println(p2);
	}
}
