package ch12;

public class Ex01 {
	public static void main(String[] args) {
		//Runnable을 구현한 클래스를 이용하여 객체 생성.
		Thread3 r1 = new Thread3();
		//Thread 생성할 때 매개변수로 위에서 생성한 객체 전달.
		Thread th1 = new Thread(r1);
		//생성된 쓰레드 start()
		th1.start();
	}
}

//Thread 대신에 Runnable로 변경
class Thread3 implements Runnable {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print('-');
		}
	}
}
