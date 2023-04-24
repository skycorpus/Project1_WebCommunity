package Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImp1 { //DAO : Data Access Object	
	public Connection getConnection() { //한번 연결하면 입력/수정/삭제/조회 공용
		Connection conn = null;
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
		} catch (Exception e) {
			System.out.println("연결 에러 : "+e.getMessage());
		}
		return conn;
	}
	
	public Customer select(String id) {
		Customer customer = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from customer where id=?";
		
		Connection conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
			if (rs.next()) { //데이터 있으면 채우고 없으면 null이 전달.
				customer = new Customer();
				customer.setId(rs.getString("id"));
				customer.setPass(rs.getString("pass"));
				customer.setEmail(rs.getString("email"));
				customer.setName(rs.getString("name"));
				customer.setReg_date(rs.getDate("reg_date"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs != null)	   rs.close(); 
				if (pstmt != null) pstmt.close(); 
				if (conn != null)  conn.close();
			} catch (Exception e) { }
		}
		return customer;
	}

	public int insert(Customer customer) {
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "insert into customer values(?,?,?,?,sysdate)";
		Connection conn = getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer.getId());
			pstmt.setString(2, customer.getPass());
			pstmt.setString(3, customer.getEmail());
			pstmt.setString(4, customer.getName());
			result = pstmt.executeUpdate(); //성공한 갯수.
		} catch (Exception e) {System.out.println(e.getMessage());
		} finally {
			try {
				if (pstmt != null) pstmt.close(); 
				if (conn != null)  conn.close();
			} catch (Exception e) { }
		}
		return result;
	}

	public int update(Customer customer) {
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "update customer set pass=?,email=?,name=? where id=?";
		Connection conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer.getPass());
			pstmt.setString(2, customer.getEmail());
			pstmt.setString(3, customer.getName());
			pstmt.setString(4, customer.getId());
			result = pstmt.executeUpdate();
		} catch (Exception e) { System.out.println(e.getMessage());
		} finally {
			try {if (pstmt != null) pstmt.close();
				 if (conn  != null) conn.close();
				} catch (Exception e) {}
			}
		return result;
	}

	//반환형이 int이면, return뒤에 들어갈 값도 정수이다.
	public int delete(String id) {
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "delete from customer where id=?";
		Connection conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
		} catch (Exception e) {System.out.println(e.getMessage());
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn  != null) pstmt.close();
			} catch (Exception e) {}
		}
		return result;
	}

	public List<Customer> list() {
		List<Customer> list = new ArrayList<>();
		PreparedStatement pstmt = null; //읽을때 필요.
		ResultSet rs = null; //읽을때 필요.
		String sql = "select * from customer order by id";
		Connection conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Customer customer = new Customer();
				customer.setId(rs.getString("id"));
				customer.setPass(rs.getString("pass"));
				customer.setName(rs.getString("name"));
				customer.setEmail(rs.getString("email"));
				customer.setReg_date(rs.getDate("reg_date"));
				
				list.add(customer); 
			}
		} catch (Exception e) {System.out.println(e.getMessage());
		} finally {
			try {
				if (rs    != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn  != null) pstmt.close();
			} catch (Exception e) {}
		}
		return list;
	}
}
