package ch04;

public class Ex03 {
	public static void main(String[] args) {
		//거스름돈 372000을 50000, 10000, 5000, 1000로 줄 때 몇 개씩 주어야 하나
		int money = 327000;
		//int won = 0;
		int ohmanwon = 0, manwon = 0, ohcheonwon = 0, cheonwon = 0;
		System.out.println("거스름돈 327,000원 받으세요.");
		while(money > 0) {
			while(money > 50000) {
			ohmanwon = (money/50000);
			money = (money - (ohmanwon*50000));
			System.out.println("남은돈 - 오만원권: "+ money);
				
				while(money > 10000) {
				manwon = (money/10000);
				money = (money - (manwon*10000));
				System.out.println("남은돈 - 만원권: "+ money);
				
					while(money > 5000) {
					ohcheonwon = (money/5000);
					money = (money - (ohcheonwon*5000));
					System.out.println("남은돈 - 오천원권: "+ money);
						
						while(money > 1000) {
						cheonwon = (money/1000);
						money = (money - (cheonwon*1000));
						System.out.println("남은돈 - 천원권: "+ money);
					}
				}
			}	
		}
		System.out.printf("50000원 = %d장, 10000원 = %d장, 5000원 = %d장, 1000원 = %d장.\n", 
				ohmanwon, manwon , ohcheonwon , cheonwon);
		}//money를 다 거슬러주면 종료.System.out.println("감사합니다. 또 오세요.");
	}
}