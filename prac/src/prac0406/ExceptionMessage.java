package prac0406;

public class ExceptionMessage {
	public static void md1(int n) {
		md2(n,0);
	}
	public static void md2(int n1, int n2) {
		int r = n1/n2;
	}
	public static void main(String[] args) {
		try {
			md1(3);
			//md2에서 발생한 예외를 처리하지 않으면 호출한 md1이 받아 처리.
			//md1도 처리하지 않으면 main으로 넘어와 처리.
		}
		catch(Exception e) {
			System.out.println("예외 발생!");
			e.printStackTrace();
		}
	}
}
