package ch04;

public class Arr9 {
	public static void main(String[] args) {
		int [] a = {85, 90, 75, 100, 95};
		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/a.length);
	}
}
