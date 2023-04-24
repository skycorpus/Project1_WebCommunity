package magic;

public class Plus {
	public int x, y;    //public 해줘야 다른 패키지에서 사용
	public void add() { //public 해줘야 다른 패키지에서 사용
		System.out.printf("%d + %d = %d\n", x, y, x+y);
	}
}
