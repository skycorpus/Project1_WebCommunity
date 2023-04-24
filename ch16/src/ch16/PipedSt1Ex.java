package ch16;

import java.util.Arrays;
import java.util.List;

public class PipedSt1Ex {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("하니",17,Member.FEMALE), 
				new Member("제니",26,Member.FEMALE), new Member("보검",31,Member.MALE),
				new Member("은우",29,Member.MALE), new Member("로제",27,Member.FEMALE));
		
		double avg = list.stream().mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("평균나이 : "+avg);
		
		avg = list.stream().filter(m->m.getGender()==Member.MALE)
				.mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("남자 평균나이 : "+avg);
		
		avg = list.stream().filter(m->m.getGender()==Member.FEMALE)
				.mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("여자 평균나이 : "+avg);
	}
}
