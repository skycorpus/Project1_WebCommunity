package ch03;

public class Do2 {
	public static void main(String[] args) {
		int sum = 0, i = 1; //!~10의 합계
		do {
			sum += i;
			System.out.printf("%d까지 합 : %d\n", i, sum);
			i++;
		}while(i <= 10);
		System.out.println("10까지 합 : " + sum);
	}
}
