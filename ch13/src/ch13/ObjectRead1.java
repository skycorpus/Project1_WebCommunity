package ch13;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.GregorianCalendar;

public class ObjectRead1 {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("data.txt"));
			while(true) {
				GregorianCalendar cal = (GregorianCalendar)ois.readObject();
				System.out.printf("%TF\n", cal);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally { 
			ois.close();
		} 
		System.out.println("프로그램 종료");
	}
}
