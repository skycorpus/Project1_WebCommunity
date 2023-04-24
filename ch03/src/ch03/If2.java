package ch03;

public class If2 {
	public static void main(String[] args) { //
		//Integer.parseInt args[0]에 들어있는 값을 정수로 변경하라
		int i1 = Integer.parseInt(args[0]);
		if (i1 > 0) {
			System.out.println("양수: " + i1);
			System.out.println("대박");
		} else {
			System.out.println("음수: " + i1);
			System.out.println("쪽박");
		}
	}
}

















