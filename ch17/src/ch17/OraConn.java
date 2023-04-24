package ch17;

import java.sql.*; //module.info.java 파일 지우면 오류안남. 내부 기능은 쓰기 편하게 만든건데 외부껄 차단해버려서. 

public class OraConn {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; //oracle 정식버전이면? xe => orcl 
		try {
			Class.forName(driver); //driver load
			//"scott"와 "tiger" 대신 자기가 설정한 아이디와 비밀번호 입력하기.
			Connection conn = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("연결 성공");
			conn.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


