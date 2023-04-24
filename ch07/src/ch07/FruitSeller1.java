package ch07;

public class FruitSeller1 {
	int numberOfApple = 20;
	int money = 0;
	final int PRICE_PER_APPLE = 1000;
	
	int saleApple(int amt) {
		money += amt;
		int num = amt/PRICE_PER_APPLE;
		numberOfApple -= num;
		return num;
	}
	
	void print() {
		System.out.println("구매자 사과갯수 : " + numberOfApple);
		System.out.println("구매자 금전잔액 : " + money);
	}
}
