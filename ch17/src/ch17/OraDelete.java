package ch17;

import java.sql.*;
import java.util.Scanner;

public class OraDelete {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삭제할 부서코드를 입력하세요.");
		
		int deptno = sc.nextInt();
		String sql = "delete from dept where deptno=?";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			int result = pstmt.executeUpdate();
			if (result > 0) System.out.println("삭제 성공");
			else System.out.println("삭제 실패"); //없는 부서코드를 넣으면 메세지 띄워줌.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			pstmt.close(); conn.close();
		}
		sc.close();
	}
}
