package ch07;

public class Fruit1Ex {
	public static void main(String[] args) {
		FruitSeller2 fs1 = new FruitSeller2("제니", 30, 1000);
		FruitSeller2 fs2 = new FruitSeller2("로제", 20, 0);
		FruitBuyer2 fb1 = new FruitBuyer2("보검", 0, 20000);
		FruitBuyer2 fb2 = new FruitBuyer2("은우", 5, 10000);
		FruitBuyer2 fb3 = new FruitBuyer2("화사", 0, 50000);
		
		fb1.buyFruit(fs1, 3000);
		fb2.buyFruit(fs2, 2000);
		fb3.buyFruit(fs1, 2000);
		                  //	사과		돈		이름
		fs1.print();  //fs1		30		1000	제니
		fs2.print();  //fs2		20		0		로제
		
		fb1.print();  //fb1		0		20000	보검
		fb2.print();  //fb2		5		10000	은우
		fb3.print();  //fb3		2		50000	화사
	}
}
