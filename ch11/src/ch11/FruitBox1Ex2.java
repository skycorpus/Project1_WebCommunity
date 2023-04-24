package ch11;

class FruitBox2<T> { //과일상자
	private T item;
	public void store(T item) { //넣기
		this.item = item;
	}
	public T pullOut() { //꺼내기 // T 대신 암거나 써도 됨.
		return item;
	}
}

public class FruitBox1Ex2 {
	public static void main(String[] args) {
		FruitBox2<Orange> fb = new FruitBox2<>();
		fb.store(new Orange(10));
		Orange orange = (Orange) fb.pullOut(); //(Orange) 오렌지로 형변환
		orange.showSugar();
		
		//Generics 사용하면 컴파일할 때 에러발생.
		//fb.store(new Apple(8));
		//Orange og2 = (Orange)fb.pullOut();
		//og2.showSugar(); //에러발생 - 사과를 넣었는데 오렌지를 건드려서 에러남.
	}
}