package ch09;

public class Math2 {
	public static void main(String[] args) {
		System.out.println(Math.random()); //0 ~ 1사이의 실수
		System.out.println((int)(Math.random()*100+1)); //1 ~ 100 사이의 정수
		int num = (int)(Math.random()*100)+1;
		System.out.println(num);
		System.out.println(Math.sqrt(num)); //root
		System.out.println(Math.pow(2,5)); //2^5
	}
}
