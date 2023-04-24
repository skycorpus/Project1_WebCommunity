package ch04;

public class Arr10 {
	public static void main(String[] args) {
		// 76, 45, 34, 89, 100, 50, 90, 92 합계와 평균
		int score[] = {76, 45, 34, 89, 100, 50, 90, 92};
		int sum = 0, max = score[0], min = score[0];
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			if (max < score[i]) max = score[i];
			if (min > score[i]) min = score[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/score.length);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		System.out.println("==========");
		
		int[] score2 = {76, 45, 34, 89, 98, 50, 90, 92, 77, 25};
		int sum2 = 0, max2 = score[0], min2 = score[0];
		for(int sc : score2) {
			sum2 += sc;
			if (max2 < sc) max2 = sc;
			if (min2 > sc) min2 = sc;
		}
		
		System.out.println("합계 : " + sum2);
		System.out.println("평균 : " + sum2/score2.length);
		System.out.println("최대값 : " + max2);
		System.out.println("최소값 : " + min2);
	}
}
