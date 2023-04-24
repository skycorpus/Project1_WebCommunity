package ch12;

//자바는 다중상속을 지원하지 않음. => Runnable
class Run1 implements Runnable {
	public void run() {
		for(int i=0;i<20;i++) {
			//Thread.currentThread() : 현재 작업중인 Thread
			System.out.println(Thread.currentThread().getName()+i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) { }
		}
	}
}

public class Runable1Ex {
	public static void main(String[] args) {
		Run1 r1 = new Run1();
		Run1 r2 = new Run1();
		Run1 r3 = new Run1();
		Thread th1 = new Thread(r1, "1번");
		Thread th2 = new Thread(r2, "2번");
		Thread th3 = new Thread(r3, "3번");
		th1.start(); th2.start(); th3.start();
	}
}
