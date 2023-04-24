package ch10;

public class Ex01 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b)
				throw new ArithmeticException();              //true
			System.out.println(2); // 예외가 발생하면 실행되지 않는 문장 //false
		} catch (RuntimeException r) {                       //catch 중 가까운걸로 실행
			System.out.println(3);
			return; // 메서드를 빠져나간다.(finally블럭을 수행한 후에)
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5); // 예외발생여부에 관계없이 항상 실행되는 문장
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		method(true);
		method(false);
	}
}
