package ch03;

public class If3 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		if(score>60) {
			System.out.printf("합격" + score);
		}else {
			System.out.printf("불합격" + score	);
		}
	} 
}
