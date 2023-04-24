package ch04;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int ar : arr) {
			sum += ar;
		}
		System.out.println("합계 : " + sum);
	}
}
