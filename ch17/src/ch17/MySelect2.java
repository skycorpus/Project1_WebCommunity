package ch17;

import java.sql.*;
import java.util.Scanner;

//사번을 받아서 이름, 입사일, 부서명

public class MySelect2 {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url =  "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		Scanner sc = new Scanner(System.in);
		Connection conn = null; Statement stmt = null; ResultSet rs = null;
		System.out.println("보고싶은 사원의 사번을 입력하세요.");
		int empno = sc.nextInt();
		String sql = "select ename, hiredate, dname from emp e, dept d "
				+ "where e.deptno=d.deptno and empno="+empno; //join 사용해봄.
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql");
			stmt = conn.createStatement(); //stmt에는 url, 아이디, 패스워드를 가진 객체.
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				System.out.println("이름 : "+rs.getString("ename"));      //rs.getString(1)
				System.out.println("입사일 : "+rs.getDate("hiredate"));   //rs.getString(2)
				System.out.println("부서명 : "+rs.getString("dname"));   //rs.getString(3)으로 바꿔쓸 수 있음.
			} else System.out.println("없는 사원입니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			rs.close(); stmt.close(); conn.close();
		}
		sc.close();
	}
}
