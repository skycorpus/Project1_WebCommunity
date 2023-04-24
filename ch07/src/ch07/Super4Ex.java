package ch07;

class H1{ //실행순서
	int x; //10 //x=34
	H1(int x){//8
		this.x = x;//9 
		System.out.println("부모 매개변수 1개");//11
	}
	H1(int x, int y){//6
		this(x);//7
		System.out.println("부모 매개변수 2개");//12
	}
	void print() {//16
		System.out.println("x = " + x);
	}
}

class H2 extends H1{
	H2(int x, int y){//4
		super(x, y);//5
		System.out.println("자식 매개변수 2개");//13
	}
	H2(int x, int y, int z){//2 //매개변수 3개.
		this(x, y);//3
		System.out.println("자식 매개변수 3개");//14
	}
}

public class Super4Ex {
	public static void main(String[] args) {
		H2 h = new H2(34, 66, 55);  //1 //매개변수가 3개임.
		h.print();//15
	}
}
