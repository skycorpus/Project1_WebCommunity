package ch09;

import pac.One;

public class OneEx extends One {
	//다른패키지의 변수나 메서드를 사용하려면 public이어야 한다.
	//상속인 경우에는 protected도 사용가능
	public static void main(String[] args) {
		OneEx oe = new OneEx();
		System.out.println(oe.getOne());
		System.out.println(oe.one);
	}
}
