package ch14;

import java.io.*;
import java.net.*;
import java.util.GregorianCalendar;

public class TimeServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7000);
		try {
			System.out.println("서버 작동 중");
			while(true) {
				Socket client = ss.accept(); //client가 접속하기를 기다림.
				OutputStream os = client.getOutputStream(); //client에 보내자.
				ObjectOutputStream oos = new ObjectOutputStream(os);//직렬화해서 보내자.
				oos.writeObject(new GregorianCalendar());
				oos.flush();
				os.close(); oos.close(); client.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			ss.close();
		}
	}
}
