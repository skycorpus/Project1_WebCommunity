package ch04;

//각 행 별로 최대, 최소, 합계를 출력하고, 천체 합계, 최대, 최소
public class Ex05 {
	public static void main(String[] args) {
		int[][] score = {{67, 78, 98}, {78, 98, 65}, {78, 56, 90}};
		int sum = 0, total = 0, max = 0, min = 100, tmax = 0, tmin = 100;
		System.out.println("국어\t영어\t수학\t합계\t최대\t최소");
		System.out.println("===========================================");
	
		 for(int i=0; i<score.length;i++) {
			 for(int j=0; j<score[i].length; j++) {
				 System.out.print(score[i][j]+"\t");
				 sum += score[i][j]; total += score[i][j];
				 if(max < score[i][j]) max = score[i][j];
				 if(min > score[i][j]) min = score[i][j];
				 if(tmax < score[i][j]) tmax = score[i][j];
				 if(tmin > score[i][j]) tmin = score[i][j];
			 }
			 System.out.println(sum+"\t"+max+"\t"+min);
			 sum = 0; max = 0; min = 100;
		 }
		 System.out.println("===========================================");
		 System.out.println("총계 : "+total+", 천체최대 : "+tmax+", 전체최소 : "+tmin);
	}
}
