package ch03;

public class Sw1 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		switch(num) { //num에 들어온 숫자와 일치하는 case문으로 이동
		case 1 : System.out.println("1인데요."); break;
		case 2 : System.out.println("2인데요."); break;
		case 3 : System.out.println("3인데요."); break;
		case 4 : System.out.println("4인데요."); break;
		case 5 : System.out.println("5인데요."); break;
		default : System.out.println("쓸데없는 숫자냐");
		}
	}
}
