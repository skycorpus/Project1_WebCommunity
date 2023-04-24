package ch04;

public class Ex03_1 {
	public static void main(String[] args) {
		int money = 327000;
		int[] unit = {50000, 10000, 5000, 1000};
		for(int i=0; i<unit.length;i++) {
			System.out.printf("%d원 짜리 : %d장\n", unit[i], money/unit[i]);
			money %= unit[i];
		}
	}
}
