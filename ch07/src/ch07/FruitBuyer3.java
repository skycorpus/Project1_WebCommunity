package ch07;

public class FruitBuyer3 {
	String name; int numberOfApple, money;
	
	public FruitBuyer3(String name, int numberOfApple, int money) {
		this.name=name; this.numberOfApple=numberOfApple; this.money=money;
	}
	
	void buyFruit(FruitSeller3 fs, int amt) {
		if(money<amt) System.out.println("돈이 다 떨어졌네요. 다음에 올게요.");
		else {
			int num = fs.saleApple(amt);
			if (num != 0) {
				numberOfApple += num;
				money -= amt;
				System.out.printf("%s 사과 득템 %d개, 지출 %d원", name, num, amt);
			} else System.out.println("사과를 못 샀습니다.");
		}
	}
	
	void print() {
		 System.out.println(name+" 사과갯수 : "+numberOfApple);
		 System.out.println(name+" 금전잔액 : "+money);
	}
}
