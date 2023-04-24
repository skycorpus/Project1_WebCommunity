package ch04;
//총점 
//합계
public class Score1_1 {
	public static void main(String[] args) {
		String subject = "성적표"; int len = 44, sum = 0;
		String[] name = {"블랙핑크","뉴진스","방탄소년","아이유"};
		String[] title = {"이름","국어","영어","수학","총점","평균"};
		int[][] score = {{90, 85, 76},{88, 77, 92},{93, 84, 69},{78, 86,92}};
		int[] tot = new int[score[0].length]; //열의 갯수
		System.out.println(subject);
		System.out.println("======");
		for(int i = 0; i < title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		for(int i =0; i < len; i++) {	System.out.print("=");		}
		System.out.println();
		for(int i =0; i < score.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j = 0; j < score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j]; 
				tot[j] += score[i][j];
			}
			System.out.println(sum+"\t"+sum/score[i].length);
			sum = 0;
		}
		for(int i =0; i < len; i++) {		System.out.print("=");		}
		System.out.print("\n합계\t");
		for(int j=0;j<tot.length;j++) {
			System.out.print(tot[j]+"\t");
			sum += tot[j];
		}
		System.out.print(sum+"\t"+sum/tot.length/name.length);
	}
}