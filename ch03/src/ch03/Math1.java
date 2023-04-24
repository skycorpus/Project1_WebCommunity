package ch03;

public class Math1 {
	public static void main(String[] args) {
		//Math.random() : 0 <= 값 < 1 사이의 랜덤한 실수
		//Math.random() * 100 => 0 ~ 99
		//Math.random() * 100 + 1 => 1 ~ 100
		System.out.println((int)Math.random() * 100 + 1);
	}
}
