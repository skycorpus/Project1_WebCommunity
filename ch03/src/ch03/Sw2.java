package ch03;

public class Sw2 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String msg = "";
		switch(num) { //num에 들어온 숫자와 일치하는 case문으로 이동
		case 1 : msg = "안녕하세요."; break;
		case 2 : msg = "반갑습니다."; break;
		case 3 : msg = "처음뵙겠습니다."; break;
		default : msg = "누구세요?";
		}
		System.out.println(msg);
	}
}

