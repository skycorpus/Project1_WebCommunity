package ch06;

class E1{
	int add(int x, int y) {
		return x + y;
	}
	//int add(int a, int b) {return a + b;} //변수이름만 다른건 안됨.
	double add(double x, double y) {
		return x + y;
	}
	String add(String name) {
		return "안녕하세요. "+name+"님!";
	}
}

public class OverLoadding1 {
	public static void main(String[] args) {
		E1 e= new E1();
		System.out.println(e.add("철수"));
		System.out.println(e.add(12, 67));
		System.out.println(e.add(3.14, 5.23));
	}
}
