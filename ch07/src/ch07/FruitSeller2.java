package ch07;

public class FruitSeller2 {
	int numberOfApple = 20, money = 0;
	String name;
	final int PRICE_PER_APPLE = 1000;
	
	public FruitSeller2(String name, int numberOfApple, int money) {
		this.name = name; this.numberOfApple = numberOfApple; this.money = money;
	}
	
	int saleApple(int amt) {
		money += amt;
		int num = amt/PRICE_PER_APPLE;
		numberOfApple -= num;
		return num;
	}
	
	void print() {
		System.out.println(name+"사과갯수 : "+numberOfApple);
		System.out.println(name+"금전잔액 : "+money);
	}
}
