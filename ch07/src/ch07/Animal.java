package ch07;

public class Animal {
	int x = 7;
	void move() {System.out.println("움직인다."); }
}

class Pig extends Animal{
	int x= 10;
	void move() {System.out.println("네 발로 움직인다.");}
}

class Bird extends Animal{
	void move() {System.out.println("날개로 난다.");}
	void eat() {System.out.println("부리로 쪼아먹는다.");}
}

class Fish extends Animal{
	void move() {
		System.out.println("지느러미를 사용하여 움직인다.");
	}
}