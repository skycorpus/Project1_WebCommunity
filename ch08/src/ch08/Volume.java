package ch08;

public interface Volume { //인터페이스를 활용하여 다형성 구현, overriding을 이용.
	void volumeUp();
	void volumeDown();
}

class Radio implements Volume{
	public void volumeUp() {
		System.out.println("라디오 볼륨을 올려요.");
	}
	public void volumeDown() {
		System.out.println("라디오 볼륨을 내려요.");
	}
}

class TV implements Volume{
	public void volumeUp() {
		System.out.println("TV 볼륨을 올려요.");
	}
	public void volumeDown() {
		System.out.println("TV 볼륨을 내려요.");
	}
}

class Speaker implements Volume{
	public void volumeUp() {
		System.out.println("스피커 볼륨을 올려요.");
	}
	public void volumeDown() {
		System.out.println("스피커 볼륨을 내려요.");
	}
}