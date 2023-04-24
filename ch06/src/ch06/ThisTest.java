package ch06;

public class ThisTest {
	int my;
	ThisTest(){
		System.out.println("인자가 없는 생성자 함수.. default 래요");
	}
	ThisTest(int i){
		this();
		my = i;
		System.out.println("인자가 있는 생성자 함수.. 인자가 1개 있네요");
	}
	public void print(int my) {
		this.my = my;
		System.out.print("my = "+this.my+" ");
	}
	public static void main(String[] args) {
		ThisTest t = new ThisTest(3);
		System.out.println("my = "+t.my);
		t.print(5);
		System.out.println("my = "+t.my);
	}
}
