package ch13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GoodWrite1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stock1.txt"));
		oos.writeObject(new GoodStock("1111", 100));
		oos.writeObject(new GoodStock("2222", 200));
		oos.writeObject(new GoodStock("3333", 300));
		oos.close();
		System.out.println("저장 완료");
	}
}
