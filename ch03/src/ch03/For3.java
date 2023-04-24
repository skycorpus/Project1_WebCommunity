package ch03;

public class For3 {
	public static void main(String[] args) {
		//1~100사이의 짝수 합, 홀수 합, 전체 합
		int evenSum = 0, oddSum = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) evenSum+=i;
			else oddSum+= i;
		}
		System.out.println("짝수 합계 : " + evenSum);
		System.out.println("홀수 합계 : " + oddSum);
		System.out.println("전체 합계 : " + (evenSum+oddSum));
	}
}
