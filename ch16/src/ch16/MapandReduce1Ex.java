package ch16;

import java.util.Arrays;
import java.util.List;

public class MapandReduce1Ex {
	public static void main(String[] args) {
		List<Student2> list = Arrays.asList(new Student2("보검",77),
				new Student2("하니",88), new Student2("로제",66), new Student2("은우",90));
		
		// 람다 + stream 합친 방법.
		double avg = list.stream().mapToInt(Student2::getScore).average().getAsDouble();
		System.out.println("평균 점수 : "+avg);
	}
}
