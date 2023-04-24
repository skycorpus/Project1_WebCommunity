package ch04;

public class Arr8 {
	public static void main(String[] args) {
		String[] fruits = {"산딸기", "판딸기","집딸기", "죽은딸기", "알카리딸기", "뱀딸기"};
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		System.out.println("=================");
		//뒤부터 출력 갯수 : fruits.length, 인덱스 fruits.length - 1
		for(int i = fruits.length -1; i>=0; i--) {
			System.out.println(fruits[i]);
		}
	}
}
