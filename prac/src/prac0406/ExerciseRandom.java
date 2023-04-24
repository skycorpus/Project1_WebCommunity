package prac0406;

import java.util.*;

public class ExerciseRandom {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("두 수 입력 : ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if(num1<num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			int length = num1 - num2 + 1;
			Random rand = new Random();
			for(int i=0; i<100; i++) {
				System.out.println("출력"+i+":");
				System.out.println(rand.nextInt(length)+num2);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
