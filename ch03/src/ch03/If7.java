package ch03;

public class If7 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		if(score >=90)
			grade = "A";
		else if(score >=80)
			grade = "B";
		else if(score >=70)
			grade = "C";
		else if(score >=60)
			grade = "D";
		else 
			grade = "shot";
		
		int ect = score % 10;
		if (ect >= 5 || score == 100) grade+= "+";
		else grade+="0";
		
		System.out.printf("score : %d, grade : %s", score, grade);
		
	}
}




