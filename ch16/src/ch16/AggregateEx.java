package ch16;

import java.util.Arrays;

public class AggregateEx {
	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1,2,3,4,5}).filter(n->n%2==0).count();
		System.out.println("짝수의 갯수 : "+count);
		long sum = Arrays.stream(new int[] {1,2,3,4,5}).filter(n->n%2==0).sum();
		System.out.println("짝수의 갯수 : "+sum);
	}
}
