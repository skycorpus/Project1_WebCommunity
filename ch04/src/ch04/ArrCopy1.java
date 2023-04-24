package ch04;

public class ArrCopy1 {
	public static void main(String[] args) {
		int[] arr1 = {34, 77, 55};
		int[] arr2 = arr1; //주소 복사하여 전달.
		int[] arr3 = new int[arr1.length];
		for(int i=0; i < arr1.length; i++) { //데이터를 하나씩 복사하여 전달
			arr3[i] = arr1[i];
		}
		arr1[1] = 150;
		for(int a1 : arr1) {
			System.out.print(a1+"\t");
		}
		System.out.println("\n==================");
		for(int a2 : arr2) { //arr1의 주소에 있는 값을 출력하므로 똑같다
			System.out.print(a2+"\t");
		}
		System.out.println("\n==================");
		for(int a3 : arr3) { //값을 전달 받았으므로 서로 다른 데이터
			System.out.print(a3+"\t");
		}
	}
}
