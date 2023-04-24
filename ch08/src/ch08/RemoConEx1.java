package ch08;

public class RemoConEx1 {
	public static void main(String[] args) {
		RemoteControl[] rc = new RemoteControl[2];
		rc[0] = new Tv1();
		rc[1] = new Radio1();
		for(int i=0; i<rc.length;i++) {
			rc[i].turnOn();
			rc[i].turnOff();
			rc[i].setMute(false);
			RemoteControl.changeBattery();
			System.out.println("최대볼륨 : "+RemoteControl.MAX_VOLUME);
			System.out.println("최소볼륨 : "+RemoteControl.MIN_VOLUME);
		}
	}
}
