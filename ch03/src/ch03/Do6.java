package ch03;

public class Do6 {
	public static void main(String[] args) {
		int i = 1, j = 2;
		System.out.println("구구단");
		do {
			do {
				System.out.printf(("%d * %d = %d\t"), j, j, j*i);
				j++;
			}while(j <=9);
			System.out.println();
			i++;
			j = 2;
		}while(i <= 9);
	}
}
