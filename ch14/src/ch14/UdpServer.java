package ch14;

import java.io.IOException;
import java.net.*;

public class UdpServer {
	public static void main(String[] args) throws IOException {
		byte[] bt = new byte[50];
		DatagramPacket dp = new DatagramPacket(bt, bt.length);
		DatagramSocket ds = new DatagramSocket(5007);
		System.out.println("서버 실행중...");
		
		String msg = "";
		while(true) {
			ds.receive(dp);
			InetAddress addr = dp.getAddress();
			msg = new String(dp.getData(),0,dp.getLength());
			System.out.println(addr+" => "+msg);
		}
	}
}
