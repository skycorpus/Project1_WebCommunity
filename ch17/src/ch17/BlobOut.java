package ch17;

import java.sql.*;
import java.io.*;

public class BlobOut {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "select photo from test where id='a1'";
		Connection conn = null; PreparedStatement pstmt = null;
		try {
			File file = new File("copy_tower.jpg"); //파일을 copy_tower.jpg라는 이름으로 복사하여 확인할 수 있음. refresh하면 보임.  
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Blob blob = rs.getBlob("photo"); // 1써도 되고 "photo" 써도 됨.
				InputStream is = blob.getBinaryStream(); //데이터를 직렬화 해서 담는다.
				//copy_tower.jpg라는 파일을 만들었음. 현재는 데이터없는 빈 파일.
				FileOutputStream fos = new FileOutputStream(file); 
				byte[] buffer = new byte[1024];
				int i = 0;
				//is.read(buffer): 한번에 1024byte씩 읽음.
				while((i=is.read(buffer)) != -1) { //-1은 더이상 데이터가 없다는 뜻.
					fos.write(buffer,0,i);
				}
				is.close(); fos.close(); rs.close();
				System.out.println("그림 출력완료.");
			} else System.out.println("그림이 없습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			pstmt.close(); conn.close();
		}
	}
}
