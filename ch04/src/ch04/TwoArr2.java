package ch04;

public class TwoArr2 {
	public static void main(String[] args) {
		//                0열  1열  2열
		int[][] score = {{67, 56, 77}, //0행
						{99, 88, 67},  //1행 
						{45, 55, 65}}; //2행
		System.out.println("국어\t수학\t영어\t총점\t평균");
		int sum = 0;
		for(int i=0; i < score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
			}
			System.out.println(sum+"\t"+sum/score[i].length);
			sum = 0; // 한 줄을 출력 후에 다시 sum을 clear
		}
	}
}
