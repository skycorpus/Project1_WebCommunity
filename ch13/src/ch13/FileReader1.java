package ch13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReader1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("읽을 파일명");
		String fileName = sc.nextLine();
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr); //한 줄씩 읽기 : 이거 안쓰면 한 글자씩 읽음.
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			System.out.println(str);
		}
		sc.close(); fr.close(); br.close();
		System.out.println("프로그램 끝");
	}
}
