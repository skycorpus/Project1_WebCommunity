package prac;

interface printable {
	public void print(String doc);
}

class SPrinter implements Printable {
	@Override //이 아래 메소드는 의도상 오버라이드하는 메소드임을 컴파일러에게 알림. 
	//컴파일러는 체크해서 문제가 있으면 알려줌.
	public void print(String doc) {
		System.out.println("삼성프린터");
		System.out.println(doc);
	}
}

class LPrinter implements Printable {
	@Override //이 아래 메소드는 의도상 오버라이드하는 메소드임을 컴파일러에게 알림. 
	//컴파일러는 체크해서 문제가 있으면 알려줌.
	public void print(String doc) {
		System.out.println("LG프린터");
		System.out.println(doc);
	}
}

public class PrintableInterface {
	public static void main(String[] args) {
		Printable prn = new Printer();
		prn.print("Hello");
		
		String myDoc="안녕하세요.";
		
		
	}
}
