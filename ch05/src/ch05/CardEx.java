package ch05;

class Card{
	static int width, height; //가로 100, 세로 240
	String kind;
	int number;
	void prn(){
		System.out.println("width = "+width);
		System.out.println("height = "+height);
		System.out.println("kind = "+kind);
		System.out.println("number = "+number);
		System.out.println("=========================");
	}
}

public class CardEx {
	public static void main(String[] args) {
		//스페이드 7, 다이아몬드 1, 클로바 10
		Card.width = 100;
		Card.height = 240;
		
		Card card1 = new Card();
		card1.kind = "스페이드";
		card1.number = 7;
		card1.prn();
		
		Card card2 = new Card();
		card2.kind = "다이아몬드";
		card2.number = 1;
		card2.prn();
		
		Card card3 = new Card();
		card3.kind = "클로바";
		card3.number = 10;
		card3.prn();
	}
}
