package ch07;

public class PersonEx {
	public static void main(String[] args) {
		Student st1 = new Student("로제", 26, "5678");
		Student st2 = new Student("제니", 25, "5679");
		Teacher th1 = new Teacher("하니", 32, "JAVA");
		Teacher th2 = new Teacher("보검", 33, "스프링");
		Manager mg1 = new Manager("은우", 18, "청소");
		Manager mg2 = new Manager("효리", 38, "노래");
		
		st1.printSt(); st2.printSt();
		th1.printTh(); th2.printTh();
		mg1.printMg(); mg2.printMg();
	}
}
