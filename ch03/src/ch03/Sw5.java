package ch03;

public class Sw5 {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = "";
		int etc = month % 3;
		switch(etc) {
		case 0: season = "초"; break;
		case 1: season = "찐"; break;
		case 2: season = "늦";
		}
		switch(month) { 
		case 12: case 1: case 2: season += "겨울입니다."; break;
		case 3: case 4: case 5: season += "봄입니다."; break;
		case 6 :case 7 :case 8 : season += "여름입니다."; break;
		case 9 :case 10 :case 11 :  season += "가을입니다"; break;
		default : season = "없는 월입니다.";
		}
		System.out.println("월은 "+ month + "이고, 계절은 " + season);
	}
}
