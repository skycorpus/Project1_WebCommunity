package ch09;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println("0부터 100까지 정수 : "+ran.nextInt(101));
		System.out.println("1부터 100까지 정수 : "+(ran.nextInt(100)+1));
		System.out.println("float 난수 : "+ran.nextFloat());
		System.out.println("double 난수 : "+ran.nextDouble());
		System.out.println("boolean 난수 : "+ran.nextBoolean());
	}
}
