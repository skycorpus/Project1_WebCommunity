package ch03;

public class If8 {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = "";
		if (month== 12 ||month== 1 ||month== 2 ) season = "겨울입니다.";
		else if (month== 3 ||month== 4 ||month== 5 ) season = "봄입니다."; 
		else if (month== 7 ||month== 8 ||month== 9 ) season = "여름입니다."; 
		else if (month== 10 ||month== 11 ||month== 12 ) season = "가을입니다";
		else season = "없는 월입니다";

		System.out.println("월은 "+ month + "이고, 계절은" + season);
	}
}
