package ch03;

import java.io.IOException;

//do~while을 이용하여 입력된 구구단 출력
public class Do4 {
	public static void main(String[] args) throws IOException {
		System.out.println("보고싶은 구구단?");
		int num = System.in.read() - '0';
		int i = 1;
		System.out.println("구구단 " + num + "단");
		do {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
			i++;
		}while(i<10);
	}
}
