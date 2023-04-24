package ch15;

@FunctionalInterface
interface MyInter3 { //여기서 MyInter3를 "타겟 타입"이라고 한다.
	int method(int x, int y);
}

public class LambdaReturnEx {
	public static void main(String[] args) {
		MyInter3 mi;
		mi = (x, y) -> { // 매개변수가 2개 이상일 경우에는 반드시 소괄호.
			int result = x + y;
			return result;
		};
		System.out.println("결과 : " + mi.method(12, 8));

		mi = (x, y) -> {return x + y;};
		System.out.println("결과 : " + mi.method(7, 6));

		// return 한 문장일 경우에는 return 포함하여 생략 가능.
		mi = (x, y) -> x + y;
		System.out.println("결과 : " + mi.method(11, 12));
	}
}
