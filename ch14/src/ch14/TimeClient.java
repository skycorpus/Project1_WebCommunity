package ch14;

import java.io.*;
import java.net.*;
import java.util.*;

public class TimeClient {
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException{
		Scanner sc = new Scanner(System.in);
		System.out.println("연결할 ip를 입력하세요.");
		String ip= sc.nextLine();
		Socket client = new Socket(ip, 7000);
		InputStream is = client.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(is);
		GregorianCalendar gc = (GregorianCalendar)ois.readObject();
		System.out.printf("현재 시간 : %TF %TT", gc, gc);
		is.close(); ois.close(); client.close();
		sc.close();
	}
}
