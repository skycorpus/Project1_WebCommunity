package ch17;

import java.io.*;
import java.sql.*;

public class BlobInsert {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "insert into test values('a1',?)";
		Connection conn = null; PreparedStatement pstmt = null;
		try {
			//project에 있는 tower.jpg를 읽어서 파일을 만든다.
			File fileName = new File("tower.jpg");
			int size = (int)fileName.length();
			InputStream is = new FileInputStream(fileName);
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			pstmt = conn.prepareStatement(sql);
			pstmt.setBinaryStream(1, is, size);
			int result = pstmt.executeUpdate();
			if (result > 0) System.out.println("입력 성공");
			else System.out.println("입력 실패");
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
		} finally {
			pstmt.close(); conn.close();
		}
	}
}
