package ch06;

class Student3 {
	String name;
	int kor; int eng; int math;
							//실행순서
	Student3(String name) {
		this(name, 60); //1
		System.out.println("매개변수 1개 이름 " + name);//7
	}
	Student3(String name, int kor) {
		this(name, kor, 60); //2
		System.out.println("매개변수 2개 이름 " + name+", 국어 : "+kor);//6
	}
	
	Student3(String name, int kor, int eng) {
		this(name, kor, eng, 60); //3
		System.out.println("매개변수 3개 이름 " + name+", 국어 : "+kor+", 영어 : "+eng);//5
	}
	
	Student3(String name, int kor, int eng, int math) {
		System.out.println("매개변수 4개 이름 " + name+", 국어 : "+kor+", 영어 : "+eng+", 수학 : "+math);//4
	}
}

public class Student3Ex {
	public static void main(String[] args) {
		Student3 st1 = new Student3("하니");
	}
}
