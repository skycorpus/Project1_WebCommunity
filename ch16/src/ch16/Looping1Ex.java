package ch16;

import java.util.Arrays;

public class Looping1Ex {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		//peek()는 중간단계 메서드라서 작동하지 않음. 에러는 아닌데 콘솔창에 출력되는게 없음.
		//Arrays.stream(intArr).filter(a->a%2==0).peek(n->System.out.println());
		
		//방법(1) 최종단계 메서드가 있어야 작동한다. sum()
		int sum=Arrays.stream(intArr).filter(a->a%2==0).peek(n->System.out.println(n)).sum();
		System.out.println("합계 : "+sum);
		
		//방법(2) 최종단계 메서드 forEach()
		Arrays.stream(intArr).filter(a->a%2==0).forEach(n->System.out.println(n));
		
		//forEach()는 filter() 조건에 맞는 수를 각각 출력할 수 있고,
		//peek()와 sum()을 사용하면 합계(sum)를 따로 출력할 수 있다.
	}
}
