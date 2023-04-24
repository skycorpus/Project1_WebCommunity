package ch17;

import java.sql.*;
import java.util.Scanner;

public class OraUpdate {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null;
		PreparedStatement pstmt = null; //* 일반 stmt보다 약간 속도가 빠름.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수정할 부서코드");
		int deptno = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 부서명");
		String dname = sc.nextLine();
		System.out.println("수정할 근무지");
		String loc = sc.nextLine();
		
		//PreparedStatement 사용할 때 "?"를 사용. //* 일반 stmt보다 사용 편리.
		String sql = "update dept set dname=?,loc=? where deptno=?"; 
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			pstmt = conn.prepareStatement(sql); //sql 문장을 추가.
			
			pstmt.setString(1, dname); //첫번째 ?에 문자열 dname
			pstmt.setString(2, loc);   //두번째 ?에 문자열 loc
			pstmt.setInt(3, deptno);   //세번째 ?에 숫자  deptno
			
			int result = pstmt.executeUpdate(); //sql 문장을 제거.
			
			if (result > 0) System.out.println("수정 되었습니다.");
			else System.out.println("수정 실패"); //수정하지 못함.
		} catch (Exception e) { //sql 문장 또는 Table 문제가 발생.
			System.out.println(e.getMessage());
		} finally {
			pstmt.close(); conn.close();
		}
		sc.close();
	}
}
