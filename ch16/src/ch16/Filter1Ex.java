package ch16;

import java.util.Arrays;
import java.util.List;

public class Filter1Ex {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "김하나", "차은우", "김태희", "김하나");
		//distinct() 중복제거
		names.stream().distinct().forEach(n->System.out.println(n));
		System.out.println("==================");
		//filter() 조건에 맞는 사람 필터링. stratsWith() 김으로 시작하는 사람.
		names.stream().filter(n->n.startsWith("김")).forEach(n->System.out.println(n));
		System.out.println("==================");
		//중복을 제거한 김으로 시작하는 사람.
		names.stream().filter(n->n.startsWith("김")).distinct()
			.forEach(n->System.out.println(n));
	}
}
