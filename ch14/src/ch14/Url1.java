package ch14;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Url1 {
	public static void main(String[] args) throws MalformedURLException { //throws URL 주소를 틀렸을때 에러.
		Scanner sc = new Scanner(System.in);
		System.out.println("url을 입력하세요.");
		String addr = sc.nextLine();
		URL url = new URL(addr);
		
		System.out.println("프로토콜 : "+url.getProtocol());
		System.out.println("호스트 : "+url.getHost());
		System.out.println("포트 : "+url.getPort());
		System.out.println("파일 경로 : "+url.getFile());
		
		sc.close();
	}
}
