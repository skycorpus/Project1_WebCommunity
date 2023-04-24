package ch05;

public class InitBlk1Ex {
	public static void main(String[] args) {
		for(int i=0; i<InitBlk1.k2.length; i++) {
			System.out.println("k2["+i+"] = "+InitBlk1.k2[i]);
		}
		System.out.println("======================");
		InitBlk1 ib1 = new InitBlk1();
		for(int i=0; i<ib1.k1.length; i++) {
			System.out.println("k1["+i+"] = "+ib1.k1[i]);
		}
	}
}
