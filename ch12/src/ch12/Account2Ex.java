package ch12;

public class Account2Ex {
	public static void main(String[] args) {
		Account2 act = new Account2(10000); //잔액이 10000원인 통장 개설
		Account2User[] au = new Account2User[5];
		//다섯명이 같은 통장 사용. 카드만 다름. 
		au[0] = new Account2User(act, "보검");
		au[1] = new Account2User(act, "세정");
		au[2] = new Account2User(act, "하니");
		au[3] = new Account2User(act, "은우");
		au[4] = new Account2User(act, "로제");
		
		for(Account2User a : au) {
			a.start();
		}
	}
}

