package ch02;

public class Var2 {
	public static void main(String[] args) {
		byte b1 = 34;
		int i1 = 34;
		float f1 = 34f;
		double d1 = 34;
		System.out.println(b1);
		System.out.println(i1);
		System.out.println(f1);
		System.out.printf("%f\n", f1);
		System.out.println(d1);
		
		int i2 = 456;
		System.out.printf("%d + %d = %d\n", i1, i2, i1 + i2);
		System.out.printf("%d - %d = %d\n", i1, i2, i1 - i2);
		System.out.printf("%d * %d = %d\n", i1, i2, i1 * i2);
		System.out.printf("%d / %d = %d\n", i1, i2, i1 / i2);
	}
}
