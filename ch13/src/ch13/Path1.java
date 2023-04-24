package ch13;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path1 {
	public static void main(String[] args) {
		Path path = Paths.get("src/ch13/Path1.java");
		System.out.println("파일명 : "+path.getFileName());
		System.out.println("부모디렉토리 " + path.getParent().getFileName());
		for(int i=0; i<path.getNameCount(); i++) {
			System.out.println(path.getName(i));
		}
	}
}


