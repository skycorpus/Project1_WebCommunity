package ch02;

public class Mono1 {
	public static void main(String[] args) {
		int i1 = 5, i2 = 5;
		// ++는 1 증가, ++가 앞에 있으면 i1은 1증가하고 출력
		// ++가 뒤에 있으면 현재값을 출력하고 1증가
		System.out.println("i1 = "+i1+", i2 = "+i2++);
		System.out.println("i1 = "+ i1+", i2 = "+i2);
		
		// --는 1감소, --가 앞에 있으면 i1은 1감소하고 출력
		// --가 뒤에 있으면 현재값을 출력하고 1감소
		System.out.println("i1 = "+i1+", i2 = "+i2--);
		System.out.println("i1 = "+ i1+", i2 = "+i2);
	}
}
