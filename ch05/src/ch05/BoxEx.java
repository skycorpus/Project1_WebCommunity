package ch05;

public class BoxEx {
	public static void main(String[] args) {
		Box Box1 = new Box();
		
		Box1.height = 10;
		Box1.width = 15;
		Box1.depth = 18;
		
		Box1.volume();
		
		Box Box2 = new Box();
		
		Box2.height = 11;
		Box2.width = 12;
		Box2.depth = 15;
		
		Box2.volume();
		System.out.println("================");
		
		Car1 c1 = new Car1();
		c1.color = "파랑";
		c1.displacement = 2500;
		c1.name = "BMW";
		
		System.out.println("색깔 : "+c1.color);
		System.out.println("배기량 : "+c1.displacement);
		System.out.println("이름 : "+c1.name);
		
		c1.speedUp();
		c1.stop();
	}
}
