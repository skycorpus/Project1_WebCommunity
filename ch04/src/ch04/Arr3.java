package ch04;

public class Arr3 {
	public static void main(String[] args) {
		int score[] = new int[6];
		//int[] score = new int[6];
		score[0] = 77; score[1] = 88; score[2] = 99; 
		score[3] = 66; score[4] = 55; score[5] = 44;
		for(int i = 0; i<score.length;i++) {
			System.out.println("score["+i+"] = " + score[i]);
		}
	}
}
