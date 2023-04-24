package ch07;

public class Outer {
	private int height;
	private int width;
	public Outer(int height, int width) {
		this.height = height; this.width = width;
	}
	public Inner getInner() {
		return new Inner();
	}
	class Inner{ //Outer$Inner.class //중첩클래스 사용방법
		private float rate = 0.5f;
		public float capacity() {
			return rate * height * width;
		}
	}
}
