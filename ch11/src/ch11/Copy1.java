package ch11;

import java.util.Arrays;

public class Copy1 {
	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4};
		//shadow copy : 얉은 복사 - 참조변수만 복사, 원본의 변화에 복사본이 영향을 받는다.
		//deep copy : 깊은 복사 - 같은 내용의 새로운 객체를 생성. 원본의 변화에 복사본이 영향을 받지 않는다.
		int[] sCopy = null, dCopy = null; 
		
		sCopy = data;
		dCopy = deepCopy(data);
		data[0] = 77;
		
		System.out.println("원본 : "+data); //해시코드 출력됨.
		System.out.println("원본 : "+Arrays.toString(data)); 
		System.out.println("sCopy : "+Arrays.toString(sCopy));
		System.out.println("dCopy : "+Arrays.toString(dCopy));
	}

	private static int[] deepCopy(int[] data) {
		int[] result = new int[data.length];
		System.arraycopy(data, 0, result, 0, result.length);
 		return result;
	}
}
