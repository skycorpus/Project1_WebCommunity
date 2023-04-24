package ch07;

public class FruitBuyer2 {
	String name; int numberOfApple, money;
	
	public FruitBuyer2(String name, int numberOfApple, int money) {
		this.name=name; this.numberOfApple=numberOfApple; this.money=money;
	}
	
	void buyFruit(FruitSeller2 fs, int amt) {
		int num = fs.saleApple(amt);
		numberOfApple += num;
		money -= amt;
	}
	
	public void print() {
		 System.out.println("구매자 사과갯수 : "+numberOfApple);
		 System.out.println("구매자 금전잔액 : "+money);
	}
}
