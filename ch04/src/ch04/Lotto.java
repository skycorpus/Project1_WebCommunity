package ch04;

import java.util.Scanner;

//로또번호 구하기 - 승부조작
public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6]; // 1~45
		int temp = 0;
		
		//승부조작
		System.out.println("번호 몇 개를 고정시킬까요?");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			System.out.println("원하는 번호를 입력하세요.");
			lotto[i] = sc.nextInt();
			//로또 번호가 발생되면 앞에 같은 숫자가 있는지 확인하고 있으면 취소
			for(int j=i-1;j>=0;j--) {
				if(lotto[i] == lotto[j]) {
					i--; //현재 인덱스 로또 번호를 취소
					break;
				}
			}
		} //승부조작
		
		for(int i=num; i<lotto.length; i++) {
						            // 0 ~ 44  => 1 ~ 45
			lotto[i] = (int)(Math.random() * 45) + 1;
			//로또 번호가 발생되면 앞에 같은 숫자가 있는지 확인하고 있으면 취소(중복 방지)
			for(int j=i-1; j>=0; j--) {
				if(lotto[i] == lotto[j]) {
					i--; // 현제 인덱스 로또 번호를 취소
					break;
				}
			}
		}
		for(int i=0; i<lotto.length; i++) { //작은 수부터 정렬
			for(int j=i+1; j<lotto.length; j++) {
				if (lotto[i]>lotto[j]) {
					temp = lotto[i]; 
					lotto[i] = lotto[j]; 
					lotto[j] = temp;
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		sc.close();
	}
}
