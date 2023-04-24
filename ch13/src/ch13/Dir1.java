package ch13;

import java.io.File;

public class Dir1 {
	public static void main(String[] args) {
		//File dir = new File("."); // 현재위치 "." : javaSrc/ch13
		//File dir = new File("src/ch13");
		//File dir = new File("../ch12/src/ch12");
		File dir = new File("../ch09/src/ch09"); //9장의 소스 출력
		String[] strs = dir.list();
		for(String str : strs ) {
			System.out.println(str);
		}
	}
}
