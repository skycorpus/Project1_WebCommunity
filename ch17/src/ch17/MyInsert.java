package ch17;

import java.sql.*;
import java.util.Scanner;

public class MyInsert {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url =  "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		Connection conn = null; Statement stmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("부서코드를 입력하세요.");
		String deptno = sc.nextLine();
		
		System.out.println("부서명을 입력하세요.");
		String dname = sc.nextLine();
		
		System.out.println("근무지를 입력하세요.");
		String loc = sc.nextLine();
		
		String sql = String.format("insert into dept values(%s,'%s','%s')",deptno,dname,loc); //''없으면 숫자인줄 알게됨.
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result>0) System.out.println("입력성공");
			else System.out.println("입력실패");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			stmt.close(); conn.close(); sc.close(); //스캐너 닫는 위치 둘 다 가능.
		}
		//sc.close();
	}
}
