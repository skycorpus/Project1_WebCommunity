package ch13;

import java.io.Serializable;
//Serializable을 구현해야 직렬화 가능.

public class GoodStock implements Serializable {
	String code;
	//transient : 전달하면 안될 때 사용. 숫자는 0, 문자는 null로 보임.
	//int num;
	transient int num;
	public GoodStock(String code, int num) {
		this.code = code; this.num = num;
	}
	public String toString() {
		return "주식[코드: "+code+", 수량:"+num+"]";
	}
}
