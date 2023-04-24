package ch04;

public class ArrCopy2 {
	public static void main(String[] args) {
		int[] arr1 = {34, 56, 67, 88, 92};
		int[] arr2 = new int[10];
		//                원본  시작  목적  시작     갯수
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); //주소 x, 값을 복사
		arr1[1] = 100;
		
		for(int arr:arr1) {
			System.out.print(arr+"\t");
		}
		System.out.println();
		
		int[] arr3 = new int[10];
		
		System.arraycopy(arr1, 0, arr3, 3, arr1.length);
		for(int arr:arr3) {
			System.out.print(arr+"\t");
		}
		System.out.println();
		int[] arr4 = new int[10];
		System.arraycopy(arr1,  1, arr4, 2, arr1.length - 1);
		for(int arr:arr4) {
			System.out.print(arr+"\t");
		}
		System.out.println();
	}
}
