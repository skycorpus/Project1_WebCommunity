package ch04;

public class Arr2 {
	public static void main(String[] args) {
		int[] i1 = new int[5];
		i1[0] = 45; i1[1] = 77; i1[2] = 66; i1[3] = 88; i1[4] = 55;
		for(int i = 0; i < i1.length; i++) {
			System.out.println("i1["+i+"] = " + i1[i]);
		}
	}
}
