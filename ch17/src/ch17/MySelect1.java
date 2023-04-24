package ch17;

import java.sql.*;

//mysql을 이용해 이름, 업무, 입사일 출력하기.

public class MySelect1 {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url =  "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select ename, job, hiredate from emp";
		System.out.println("이름\t업무\t\t입사일");
		System.out.println("==================================================");
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString("ename")+"\t");
				if(rs.getString("job").length() > 7) //줄맞춤을 위해 추가한 코드.
					System.out.print(rs.getString("job")+"\t");
				else System.out.print(rs.getString("job")+"\t\t");
				System.out.println(rs.getDate(3)+"\t"); //날짜 데이터형 : .getData() 사용.
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally { //에러 발생여부 관계없이 무조건 실행
			rs.close(); stmt.close(); conn.close(); 
		}
	}
}

