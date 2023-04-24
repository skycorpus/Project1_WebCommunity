package ch02;

public class Sustitute2 {
	public static void main(String[] args) {
		int i1= 12, i2 = 7;
		i1 += i2; // -=, *=, /=, %= 하신 후에 i1값과 i2값을 출력 
		// i1 = 12 + 7 => 19
		System.out.println("i1 = "+i1+", i2 = "+i2);
		i1 -= i2;
		// i1 = 19 - 7 => 12
		System.out.println("i1 = "+i1+", i2 = "+i2);
		i1 *= i2;
		// i1 = 12 * 7 => 84
		System.out.println("i1 = "+i1+", i2 = "+i2);
		i1 /= i2;
		// i1 = 84 / 7 => 12
		System.out.println("i1 = "+i1+", i2 = "+i2);
		i1 %= i2; // 몫을 나누고 남은 나머지값
		// i1 = 12 % 7 =>5
		System.out.println("i1 = "+i1+", i2 = "+i2);
	}
}
