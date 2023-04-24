package ch03;

public class While4 {
	public static void main(String[] args) {
		System.out.println("구구단");
		int i = 1, j = 2;
		while(i <= 9) {
			while(j <= 9) {
				System.out.printf("%d * %d = %d\t", j, i, i*j);
				j++;
		}
		System.out.println();
		j = 2;
		i++;
		}
	}
}
