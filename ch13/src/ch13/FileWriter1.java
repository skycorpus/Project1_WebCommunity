package ch13;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriter1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일명을 입력하세요.");
		String fileName = br.readLine();
		System.out.println("저장할 내용을 입력하세요.");
		String content = br.readLine();
		FileWriter fw = new FileWriter(fileName);
		fw.write(content);
		fw.close();
		br.close();
		System.out.println("프로그램 종료.");
	}
}
