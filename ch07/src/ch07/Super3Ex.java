package ch07;

class G1{
	int age = 47;
	G1(String name){
		System.out.println(name+"님이 생성되었습니다.");
	}
	void disp(){
		System.out.println("오늘은 금요일이야.");
	}
}

class G2 extends G1{
	int age = 18;
	G2(String name){ //super(매개변수, ) 없으면 부모 default 생성자가 호출된다.
		super(name);
		System.out.println(name+"야. 반가워.");
	}
	void disp() {
		System.out.println("공부하기 딱 좋은 요일이구나.");
	}
	void print() {
		System.out.println("부모 나이 : "+super.age);
		super.disp();
		System.out.println("자식 나이: "+age);
		disp();
	}
}

public class Super3Ex {
	public static void main(String[] args) {
		G2 g = new G2("김하나");
		g.print();
	}
}
