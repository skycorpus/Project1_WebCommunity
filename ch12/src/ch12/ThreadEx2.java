package ch12;

class Thread2 extends Thread{
	public Thread2(String title) {
		super(title);
	}
	
	public void run() {
		for(int i=0; i<=50; i++) {
			//getName은 쓰레드명 읽기
			System.out.print(getName()+i+"\t");
			if(i%10==0) System.out.println();
			//sleep안에 들어간 숫자는 1/1000초 단위 
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {	}
		}
	}
}

public class ThreadEx2 {
	public static void main(String[] args) {
		Thread2 th1 = new Thread2("대박");
		Thread2 th2 = new Thread2("쪽박");
		th1.start(); th2.start();
		for(int i=0; i<=50; i++) {
			System.out.print("메인"+i+"\t");
			if(i%10==0) System.out.println();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) { }
		}
		System.out.println("프로그램 종료.");
	}
}
