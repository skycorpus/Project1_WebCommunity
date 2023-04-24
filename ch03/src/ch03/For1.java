package ch03;

public class For1 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for(int i = 1; i > 0; i--) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for(int i = 1; i <= 10; i+=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for(int i = 1; i <= 10; i*=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		int i = 1;
		for(; i <= 10; i*=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for(; i <= 10;) {
			i*=2;
			System.out.print(i+"\t");
		}
		System.out.println();
	}
}
