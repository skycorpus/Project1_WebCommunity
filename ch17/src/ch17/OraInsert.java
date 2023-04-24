package ch17;
//Oracle DB에 입력하는 예제.
import java.sql.*;
import java.util.Scanner;

public class OraInsert {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null; Statement stmt = null; //ResultSet rs = null;은 조회한 결과를 저장하는 코드이므로 여기선 안 씀.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("부서코드를 입력하세요.");
		//문자와 숫자를 반복해서 입력할 경우는 문자로 읽어서 숫자로 형 변환해야 한다. : Integer.parseInt()
		//sc.nextLine();은 사용가능 : String.format()에서 %d 대신 %s를 써야함.
		//이렇게 String sql = String.format("insert into dept values(%s,'%s','%s')",deptno,dname,loc);
		
		//sc.nextInt(); 숫자와 문자가 한줄에 있으면 숫자까지만 읽고 문자부분을 처리하지 않음.
		//이걸 써버리면 부서명, 근무지 입력못한 상태로 바로 넘어가버림.
		int deptno = Integer.parseInt(sc.nextLine()); // 13 enter
		
		System.out.println("부서명을 입력하세요.");
		String dname = sc.nextLine();
		
		System.out.println("근무지를 입력하세요.");
		String loc = sc.nextLine();
		
		//값이 숫자일 때는 그냥 사용, 문자열일 때는 앞뒤로 작은 따옴표.
		//String sql = "insert into dept values("+deptno+",'"+dname+"','"+loc+"')"; // 방법 (1)
		String sql = String.format("insert into dept values(%d,'%s','%s')",deptno,dname,loc); // 방법(2)
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			stmt = conn.createStatement();
		//  입력/수정/삭제는 executeUpdate, 성공한 갯수를 반환한다.
			int result = stmt.executeUpdate(sql);
			if(result>0) System.out.println("입력성공"); 
			//입력에 성공하면 result 값이 1 올라가니까 result == 1 이지만, 
			//수정을 하는 등 다른 작업이 일어나면 result 값이 하나씩 올라가므로 result > 0 권장.
			else System.out.println("입력실패");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			stmt.close(); conn.close();
		}
		sc.close();
	}
}
