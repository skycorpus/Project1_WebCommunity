package ch04;

public class Arr4 {
	public static void main(String[] args) {
		//5개의 배열안에 1~20사이의 랜덤한 정수를 대입하고 출력
		int[] i1 = new int[5];
		for(int i = 0; i < i1.length; i++) {
			i1[i] = (int)(Math.random()*20) + 1;
		}
		for(int i = 0; i < i1.length; i++) {
			System.out.printf("i1[%d] = %d\n", i, i1[i]);
		}
		System.out.println("==========");
		// 확장(신) for
		for(int i:i1) { //배열에서 데이터를 앞에서부터 한 건씩 옮겨서 사용
			System.out.println(i);
		}
	}
}

