package ch03;

public class Ex02 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//1+ (1+2) + (1+2+3) ... (1+2+...+9+10)까지 결과 => 수열문제
		int sum = 0, totalSum = 0;
		for(int i=1; i<=10; i++) {
			sum+=i;
			totalSum += sum;
			System.out.printf("합계(1~%d): %d\n",i, sum);
		}
		System.out.println("\n누적 합계 : "+totalSum);
	}
}
