package ch03;

public class While2 {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		//while문을 이용하여 1부터 10까지 합계
		while(i<=10) {
			sum += i;
			System.out.printf("%d까지 합계 : %d\n", i, sum);
			i++;
		}
		System.out.printf("10까지 합계 : " + sum);
	}
}
