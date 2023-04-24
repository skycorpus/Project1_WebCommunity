package ch07;

public class FruitBuyer1 {
	int numberOfApple = 0;
	int money = 5000;
	void buyFruit(FruitSeller1 fs, int amt) {
		int num = fs.saleApple(amt);
		numberOfApple += num;
		money -= amt;
	}
	public void print() {
		 System.out.println("구매자 사과갯수 : "+numberOfApple);
		 System.out.println("구매자 금전잔액 : "+money);
		
	}
}
