package ch09;

class Card {
	String kind; int number;
	public Card(String kind, int number) {
		this.kind = kind; this.number = number;
	}
	
	public boolean equals(Card obj) { //(Object obj) 대신 (Card obj)쓰면 
		//return number ==((Card)obj).number;//번호가 같으면 같다. ==obj.number; 형변환 안해도 됨.
		return kind.equals(obj.kind);//종류가 같으면 같다.
	}
	
	public String toString() {
		return "출력카드[종류:"+kind+", 번호:"+number+"]";
	}
}


public class CardEx {
	public static void main(String[] args) {
		Card c1 = new Card("스페이드", 10);
		Card c2 = new Card("스페이드", 7);
		Card c3 = new Card("하트", 10);
		
		if(c1.equals(c2)) System.out.println("c1 = c2");
		else System.out.println("c1 /= c2");
		
		if(c1.equals(c2)) System.out.println("c1 = c3");
		else System.out.println("c1 /= c3");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
