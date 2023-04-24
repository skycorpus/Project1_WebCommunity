package ch07;

public class FruitSeller3 {
	String name; int numberOfApple, money;
	final int PRICE_PER_APPLE = 1000;
	
	public FruitSeller3(String name, int numberOfApple, int money) {
		this.name = name; this.numberOfApple = numberOfApple; this.money = money;
	}
	
	int saleApple(int amt) {
		int num = amt/PRICE_PER_APPLE;
		if(numberOfApple>=num) {
			money += amt;
			numberOfApple -= num;
			System.out.printf("%d개 판매, 수입 %d원\n", num, amt);
		} else {
			System.out.println("사과가 떨어졌어요.");
			num = 0;
		}
		return num;
	}
	
	void print() {
		 System.out.println(name+" 사과갯수 : "+numberOfApple);
		 System.out.println(name+" 금전잔액 : "+money);
	}
}
