package ch16;

import java.util.Arrays;

public class Match1Ex {
	public static void main(String[] args) {
		int[] intArr = {2,4,6};
		boolean result = Arrays.stream(intArr).allMatch(a->a%2==0);
		System.out.println("모두 짝수 : "+result);
		System.out.println();
		
		result = Arrays.stream(intArr).anyMatch(a->a%3==0);
		System.out.println("3의 배수가 있나 : "+result);
		System.out.println();
		
		result = Arrays.stream(intArr).noneMatch(a->a%3==0);
		System.out.println("3의 배수가 없나 : "+result);
		System.out.println();
	}
}
