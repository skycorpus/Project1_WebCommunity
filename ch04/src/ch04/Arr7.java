package ch04;

public class Arr7 {
	public static void main(String[] args) {
		/*
		 * for(String ar : args) { System.out.println(ar); }
		 */
		//Integer.parseInt 문자열로 입력한 데이터를 정수형으로 변경
		for(String ar : args) {
			System.out.println(Integer.parseInt(ar));
		}
	}
}
