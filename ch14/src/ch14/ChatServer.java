package ch14;

import java.io.*;
import java.net.*;

public class ChatServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(7001); //통실한 서버 소켓 생성
			System.out.println("서버 실행중..");
			while(true) {
				Socket client = ss.accept(); //클라이언트가 연결할 때 까지 대기
				//고객이 보낸 데이터를 읽을 준비
				DataInputStream dis = new DataInputStream(client.getInputStream());
				//고객이 보낸 데이터를 한 줄씩 읽을 준비
				BufferedReader br = new BufferedReader(new InputStreamReader(dis));
				//                 고객 ip 주소                      고객 메세지
				System.out.println(client.getInetAddress()+" => "+br.readLine());
				dis.close(); br.close(); client.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
