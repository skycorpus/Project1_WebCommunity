package ch17;

import java.sql.*;
import java.util.Scanner;

//mysql emp에 해당하는 사번에 대하여 이름, 업무 수정.
public class MyUpdate {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url =  "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		Connection conn = null; PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수정할 사번");
		int empno = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 이름");
		String ename = sc.nextLine();
		System.out.println("수정할 업무");
		String job = sc.nextLine();
		
		String sql = "update emp set ename=?,job=? where empno=?";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql");
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, ename);
			pstmt.setString(2, job);
			pstmt.setInt(3, empno);
			
			int result = pstmt.executeUpdate();
			
			if (result > 0) System.out.println("수정되었습니다.");
			else System.out.println("수정실패");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			pstmt.close(); conn.close();
		}
		sc.close();
	}
}
