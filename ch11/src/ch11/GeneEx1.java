package ch11;

//객체를 선언/생성할 때 T의 데이터형이 결정된다. 
class GeneT<T> { //꼭 <T>가 아니여도 아무 대문자 가능. 
	T[] v;
	public void set(T[] v) {
		this.v = v;
	}
	public void print() {
		for(T s:v) {
			System.out.println(s);
		}
	}
}

public class GeneEx1 {
	public static void main(String[] args) {
		//gt1에서 T는 String임.
		GeneT<String> gt = new GeneT<>();
		String[] ss = {"대박", "사건", "꺼이꺼이"};
		gt.set(ss);
		gt.print();
		System.out.println("==================");
		
		//gt2에서 T는 Integer임.
		GeneT<Integer> gt2 = new GeneT<>();
		Integer[] kk = {34,78,99,37};
		gt2.set(kk);
		gt2.print();
	}
}
