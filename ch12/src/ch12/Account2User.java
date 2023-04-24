package ch12;

public class Account2User extends Thread {
	boolean flag;
	Account2 act; //포함관계  : 변수 참조변수 
	String name;
	public Account2User(Account2 act, String name) {
		this.act = act; this.name=name;
	}
	public void run() {
	//  false/true를 번갈아가며 사용하여 출금과 입금을 발생.
		for(int i=0;i<5;i++) {
			//계좌를 동시에 두 명이 사용하는 것을 방지
			synchronized(act) {
				int amt = (int)(Math.random()*10000)+1;
				if (flag) act.deposit(amt,name); //입금
				else act.withdraw(amt, name);
			}
			flag = !flag; //true면 false를 false면 true를 반환.
			act.print();
		}
	}
}
