package ch06;

public class Person2Ex {
	public static void main(String[] args) {
		Student4 st1 = new Student4();
		st1.setName("로제"); st1.setAge(26); st1.setSno("가 1234");
		Student4 st2 = new Student4();
		st2.setName("보검"); st2.setAge(29); st2.setSno("나 1234");
		Teacher th1 = new Teacher();
		th1.setName("유재석"); th1.setAge(51); th1.setSubject("자바");
		Teacher th2 = new Teacher();
		th2.setName("하니"); th2.setAge(16); th2.setSubject("데이터베이스");
		Manager mg1 = new Manager();
		mg1.setName("박명수"); mg1.setAge(52); mg1.setPart("화장실청소");
		Manager mg2 = new Manager();
		mg2.setName("제니"); mg2.setAge(25); mg2.setPart("운전");
		
		st1.printAll(); st2.printAll();
		th1.printAll(); th2.printAll();
		mg1.printAll(); mg2.printAll();
	}
}
