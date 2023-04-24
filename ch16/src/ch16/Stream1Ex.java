//Stream 예제
package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1Ex {
	public static void main(String[] args) {
		//list 선언 방법(1)
		//List<String> list = new ArrayList<>();
		//list.add("로제"); list.add("하니"); list.add("보검");
		
		//list 선언 방법(2)
		List<String> list = Arrays.asList("로제", "하니", "보검");
		
		//출력 방법(1) 외부반복자 : for문 혹은 iterator.
		for(String name:list) {
			System.out.println(name);
		}
		System.out.println("=================");
		
		//출력 방법(2) 내부반복자 : lambda 방식 + Sting 방식. 속도 빨라지고 최신방식.
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}
}
