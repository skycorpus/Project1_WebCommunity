package ch11;

class FruitBox { //과일상자
	private Object item;
	public void store(Object item) { //넣기
		this.item = item;
	}
	public Object pullOut() { //꺼내기
		return item;
	}
}

public class FruitBox1Ex {
	public static void main(String[] args) {
		FruitBox fb = new FruitBox();
		fb.store(new Orange(10));
		Orange orange = (Orange) fb.pullOut(); //(Orange) 오렌지로 형변환
		orange.showSugar();
		
		//컴파일할 땐 문제거 발생하지 않고, 실행할 때 에러.
		fb.store(new Apple(8));
		Orange og2 = (Orange)fb.pullOut();
		og2.showSugar(); //에러발생 - 사과를 넣었는데 오렌지를 건드려서 에러남.
	}
}
