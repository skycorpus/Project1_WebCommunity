package ch03;

public class Sw6 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		int ten = score / 10;
		//int ten = (score - 1) / 10; //91점 이상이 A인 경우
		switch(ten) {
			case 10: case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			default : grade = "F";
		}
		System.out.printf("점수는 %d이고, 학점은 %s입니다.", score, grade);	
	}
}
