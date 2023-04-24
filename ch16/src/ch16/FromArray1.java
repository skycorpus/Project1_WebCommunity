package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArray1 {
	public static void main(String[] args) {
		String[] list = {"하니", "제니", "로제", "보검", "은우"};
		Stream<String> stream = Arrays.stream(list);
		stream.forEach( k -> System.out.println(k+", "));
		System.out.println();
		
		int[] intArray = {12, 76, 56, 44, 99, 88};
		IntStream stream2 = Arrays.stream(intArray);
		stream2.forEach( n -> System.out.print(n+", "));
		System.out.println();
		
		List<Student2> list2 = Arrays.asList(new Student2("보검",77),
				new Student2("하니",88), new Student2("로제",66), new Student2("은우",90));
		//java.lang.IllegalStateException 오류.
		Stream<Student2> stream3 = list2.stream(); //오류 해결 : 각각의 foreach()마다 stream<> 선언이 필요함. 
		stream3.forEach(s -> System.out.print(s.getName()+", ")); //이름
		System.out.println();
		
		Stream<Student2> stream4 = list2.stream();
		stream4.forEach(s -> System.out.print(s.getScore()+", ")); //점수
		System.out.println();
		
		Stream<Student2> stream5 = list2.stream();
		stream5.forEach(s -> System.out.print(s.getName()+":"+s.getScore()+", ")); //이름 + 점수
	}
}