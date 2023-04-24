package ch13;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GoodRead1 {
	public static void main(String[] args) throws IOException {
		ObjectInputStream ois = null;
		try {
		ois = new ObjectInputStream(new FileInputStream("stock1.txt"));
		while(true) {
			GoodStock gs = (GoodStock)ois.readObject();
			System.out.println(gs);
			}
		} catch (Exception e) {
			System.out.println("다 읽었다.");
		}
		ois.close();
	}
}


