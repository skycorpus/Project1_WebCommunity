package ch05;

class Static2{
	int x;
	static int y;
	void add() {
		x++;
		y++;
	}
}

public class Static2Ex {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			Static2 st = new Static2();
			st.add();
			System.out.println("x = " + st.x + ", y = " + st.y);		
		}	
	}
}
