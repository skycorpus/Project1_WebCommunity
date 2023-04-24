// 3/16의 Student2 예제와 함께 씀. 
package ch16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Sorting1Ex {
	public static void main(String[] args) {
		IntStream intStrm = Arrays.stream(new int[] {5,2,4,3,1});
		intStrm.sorted().forEach(n -> System.out.print(n+", "));
		System.out.println();
		
		List<Student2> list = Arrays.asList(new Student2("보검",77),
				new Student2("하니",88), new Student2("로제",66), new Student2("은우",90));
		
		list.stream().sorted().forEach(s->System.out.print(s.getScore()+", "));
		System.out.println();
		
		list.stream().sorted().forEach(s->System.out.print(s.getName()+":"+s.getScore()+", "));
		System.out.println();
		
		list.stream().sorted(Comparator.reverseOrder())
			.forEach(s->System.out.print(s.getName()+":"+s.getScore()+", "));
		System.out.println();
	}
}
