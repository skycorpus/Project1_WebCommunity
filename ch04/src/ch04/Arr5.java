package ch04;

public class Arr5 {
	public static void main(String[] args) {
		int[] k1 = {77, 88, 88, 66, 44}; //배열 생성하고 데이터 5건 대입
		for(int k : k1) { //대입과 생성을 동시에 함.
			System.out.println(k); 
		}
		System.out.println("=================");
		int[] k2; //배열의 선언과 생성 대입을 분리할 때
		k2 = new int[] {77, 88, 88, 66, 44};
		for(int i = 0; i < k2.length; i++) {
			System.out.println(k2[i]);
		}
	}
}
