package ch12;

public class Account1 {
	private int total;
	public Account1(int total) {
		this.total = total;
	}
	//synchronized 동기화 : 동시에 이 메서드를 사용하는 것을 금지.
	synchronized void deposit(int amt, String name) {
		total += amt;
		System.out.println(name+"입금 : "+amt);
	}
	synchronized void withdraw(int amt, String name) {
		if(amt <= total) {
			total -= amt;
			System.out.println(name+"출금 : "+amt);
		} else System.out.println("잔액이 부족합니다. 다음에 이용해주세요.");
	}
	void print() {
		System.out.println("잔액 : "+total);
	}
}
