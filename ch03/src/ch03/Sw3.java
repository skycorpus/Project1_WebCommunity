package ch03;

public class Sw3 {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = "";
		switch(month) { //num에 들어온 숫자와 일치하는 case문으로 이동
		case 12: case 1: case 2: season = "겨울입니다."; break;
		case 3: case 4: case 5: season = "봄입니다."; break;
		case 6 :case 7 :case 8 : season = "여름입니다."; break;
		case 9 :case 10 :case 11 :  season = "가을입니다"; break;
		default : season = "?";
		}
		System.out.println("월은 "+ month + "이고, 계절은" + season);
	}
}
