package ch06;

class Box{
	int volume(int x, int y, int z){
		return x * y * z;
	}
	double volume(double x, double y, double z){
		return x * y * z;
	}
}

public class OverLoadding2 {
	public static void main(String[] args) {
		Box box = new Box();
		System.out.println("정수연산 부피 : "+box.volume(12, 15, 20));
		System.out.println("실수연산 부피 : "+box.volume(12.7, 5.6, 7.4));
		//실수와 정수가 섞여있는 정수는 실수로 변경가능, 실수는 강제형변환 하지않으면 정수로 변환이 불가능.
		System.out.println("정수/실수연산 부피 : "+box.volume(15.2, 5, 20));
	}
}
