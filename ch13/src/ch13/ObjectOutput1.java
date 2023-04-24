package ch13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutput1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
		oos.writeObject(new GregorianCalendar(2023,2,11));
		oos.writeObject(new GregorianCalendar(2023,2,13));
		oos.writeObject(new GregorianCalendar(2023,2,14));
		oos.close();
		System.out.println("직렬화 완료");
	}
}

