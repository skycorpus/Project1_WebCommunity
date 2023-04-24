package ch12;

class Daemon1 extends Thread{
	public void run() {
		while(true) {
			System.out.println("데몬");
			try { Thread.sleep(300); } catch(InterruptedException e) { }
		}
	}
}

public class DaeMon1Ex {
	public static void main(String[] args) {
		Daemon1 dm = new Daemon1();
		//setDaemon(true) : 메인 작업이 끝나면 모든 쓰레드를 종료해라. 반드시 start()보다 앞에서 실행.
		dm.setDaemon(true);
		dm.start();
		for(int i=0;i<20;i++) {
			System.out.println(i);
			try {Thread.sleep(300);} catch(InterruptedException e) {}
		}
	}
}
