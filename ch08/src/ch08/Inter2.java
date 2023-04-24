package ch08;

interface B1{
	int K1 = 10;
	void m1();
}

interface B2 extends B1{
	void m2();
}

interface B3{
	void m3();
}

interface B4 extends B2, B3{
	void m4();
}

class B5 implements B4{
	public void m1() {System.out.println("헉");}
	public void m2() {System.out.println("허각");}
	public void m3() {System.out.println("허공");}
	public void m4() {System.out.println("헐~");}
}

public class Inter2 {
	public static void main(String[] args) {
		B5 b5 = new B5();
		b5.m1(); b5.m2(); b5.m3(); b5.m4();
		System.out.println("K = "+b5.K1);
	}
}
