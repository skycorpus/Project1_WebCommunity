package ch04;

public class TwoArr1 {
	public static void main(String[] args) {
		int[][] test = new int[2][3]; //2행 3열
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		test[1][0] = 150;
		test[1][1] = 250;
		test[1][2] = 350;
		
		for(int i=0; i < test.length; i++) { //행부터 시작
			for(int j=0; j < test[i].length;j++) {
				System.out.print(test[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("==========================");
		for(int[] tet : test) {
			for(int t : tet) {
				System.out.print(t+"\t");
			}
			System.out.println();
		}
	}
}
