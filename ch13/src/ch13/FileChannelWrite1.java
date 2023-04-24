package ch13;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelWrite1 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("c:/java/file.txt");
		FileChannel fc = FileChannel.open(path, StandardOpenOption.CREATE,
				StandardOpenOption.WRITE);
		String data = "안녕 컴 친구들 !!!";
		Charset charset = Charset.defaultCharset();
		ByteBuffer bf = charset.encode(data);
		int byteCnt = fc.write(bf);
		System.out.println(byteCnt+"글자 저장 완료");
		fc.close();
	}
}



