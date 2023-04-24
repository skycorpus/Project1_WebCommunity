package ch12;

class Thread1 extends Thread {
	public Thread1(String title) {
		super(title);
	}
	
	public void run() { // 쓰레드를 실행하는 메서드
		for(int i=0; i<100; i++) {
			System.out.print(getName()+i+"\t");
			if(i%9 == 0) System.out.println();
			try {
				Thread.sleep(500); //0.5초 쉬어라. 단위가 1/1000초.
			} catch (InterruptedException e) {}
		}
	}
}

public class TheadEx1 {
	public static void main(String[] args) {
		//main쓰레드, th1쓰레드, th2쓰레드 총 3개의 쓰레드가 돌아감. 속도가 빨라짐. 순서는 섞임.
		Thread1 th1 = new Thread1("th1");
		Thread1 th2 = new Thread1("th2");
		//th1.run(); //쓰레드 사용하지 않을 때.
		th1.start(); th2.start();//쓰레드 사용할 때.
		for(int i=0; i<100; i++) {
			System.out.print("메인"+i+"\t");
			if(i%9 == 0) System.out.println();
			try {
				Thread.sleep(500); //0.5초 쉬어라. 단위가 1/1000초.
			} catch (InterruptedException e) {}
		}
		System.out.println("프로그램 종료.");
	}
}
