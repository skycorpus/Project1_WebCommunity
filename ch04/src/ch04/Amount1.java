package ch04;

public class Amount1 {
	public static void main(String[] args) {
		String subject = "매출현황";
		int len = 54, sum=0;
		String[] name = {"냉장고", "테레비", "청소기"};
		String[] title = {"제품명", "1월", "2월", "3월", "4월", "총점", "평균"};
		int[][] amt = {{250, 170, 300, 780}, {170, 120, 150, 220}, {450, 120, 400, 250}};
		int[] tot = new int[amt[0].length]; //열의 갯수
		System.out.println(subject);
		System.out.println("==========");
		
		for(int i = 0; i<title.length;i++) { //목차 title
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		
		for(int i=0; i<len; i++) { //구분선 ===
			System.out.print("=");
		}
		System.out.println();
			
		for(int i=0; i<amt.length; i++) { //매출(판매량) amt
			System.out.print(name[i]+"\t"); //제품명 name
			for(int j=0; j<amt[i].length;j++) { 
				System.out.print(amt[i][j]+"\t"); //제품별 판매량 amt
				sum += amt[i][j];
				tot[j] += amt[i][j];
			}
			System.out.println(sum+"\t"+sum/amt[i].length); //제품별 총점, 평균
			sum = 0;
		}
		
		for(int i=0; i<len; i++) { //구분선 ===
			System.out.print("="); 
		}
		
		System.out.print("\n총힙계\t"); //총합계 tot
		for(int j=0; j<tot.length;j++) {
			System.out.print(tot[j]+"\t");
			sum += tot[j];
		}
		System.out.print(sum+"\t"+sum/tot.length/name.length);
		sum = 0;
	}
}
