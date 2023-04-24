package ch13;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx1 {
	public static void main(String[] args) throws IOException {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		int data = 0;
		//-1은 읽을 데이터가 없다. input.read() 데이터를 1byte씩 읽는다.
		while((data = input.read()) != -1) {
			output.write(data);
		}
		outSrc = output.toByteArray(); //데이터 byte 배열로 만들어서 넣는다.
		output.close(); input.close(); //close()할 때 문제발생할 경우 throws IOException 해줌.
		//Arrays.toString가 없으면 패키지명, 클래스명@해시코드
		System.out.println("inSrc : "+Arrays.toString(inSrc));
		System.out.println("outSrc : "+Arrays.toString(outSrc));
	}
}
