package ch17;

import java.sql.*;

//MyConnect
public class MyConn {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		//                                    (default port번호 3306)  
		//                           ip번호     port DB명   
		String url =  "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		try {
			Class.forName(driver); //driver load
			Connection conn = DriverManager.getConnection(url,"root","mysql"); //연결
			System.out.println("연결성공");
			conn.close(); //연결종료
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}




