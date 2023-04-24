package ch17;

import java.sql.*;
import java.util.Scanner;

public class MyPro1 {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url =  "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		Connection conn = null; CallableStatement cs = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드");
		int deptno = Integer.parseInt(sc.nextLine());
		System.out.println("부서명");
		String dname = sc.nextLine();
		System.out.println("근무지");
		String loc = sc.nextLine();
		String sql = "{call dept_insert(?,?,?)}";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql");
			cs = conn.prepareCall(sql);
			cs.setInt(1, deptno);
			cs.setString(2, dname);
			cs.setString(3, loc);
			cs.executeUpdate();
			System.out.println("입력 성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			cs.close(); conn.close();
		}
		sc.close();
	}
}
