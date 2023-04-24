package customer;

import java.util.*;

public class Ex01 {
	private static CustomerServiceImp1 csi = new CustomerServiceImp1();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String command = "";
		help();
		while(true) {
			System.out.println("<명령어를 입력하세요.>");
			command = sc.nextLine();
			if(command.equals("x")) break; //프로그램 종료
			else if (command.startsWith("insert"))//insert로 시작한 명령어.
				//콤마(,)를 기준으로 데이터를 나눠서 배열로 만든다. insert라는 메서드에 매개변수로 전달한다.
				insert(command.split(","));
			else if (command.startsWith("update")) update(command.split(","));
			else if (command.startsWith("select")) select(command.split(","));
			else if (command.startsWith("delete")) delete(command.split(","));
			else if (command.equals("list")) list();
			else help();
		}
		sc.close();
		System.out.println("<프로그램 종료>");
	}
	
	private static void list() {
		Collection<Customer> list = csi.list();
		if(list == null || list.size() == 0)
			System.out.println("데이터가 없습니다.");
		else {
			for(Customer customer : list) {
				System.out.println(customer);
			}
		}
	}

	private static void delete(String[] str) {
		if(str.length != 2) {
			help();
			return; //메서드 종료.
		}
		int result = csi.delete(str[1]);
		if(result > 0) System.out.println("고객님의 정보가 삭제되었습니다.");
	}

	//update 만들기 
	private static void update(String[] str) {
		if(str.length != 6) {
			help();
			return; //메서드 종료.
		}
		//                                  k1      1   k1@k.com   철수      오늘날짜
		Customer customer = new Customer(str[1], str[2], str[4], str[5], new Date());
		if (!str[2].equals(str[3])) {
			System.out.println("<수정페이지 - 암호와 암호확인이 다릅니다.>");
			return;
		}
		int result = csi.update(customer);
		if (result > 0) System.out.println("<고객정보 수정에 성공했습니다.>");
	}

	private static void select(String[] str) {
		if(str.length != 2) {
			help();
			return; //메서드 종료.
		}
		Customer customer = csi.select(str[1]);
		if(customer==null) System.out.println("<없는 고객입니다.>");
		else System.out.println(customer);
	}

	private static 
	void insert(String[] str) {
		if(str.length != 6) {
			help();
			return; //메서드 종료.
		}
		//                                  k1      1   k1@k.com   철수      오늘날짜
		Customer customer = new Customer(str[1], str[2], str[4], str[5], new Date());
		if (!str[2].equals(str[3])) {
			System.out.println("<암호와 암호확인이 다릅니다.>");
			return;
		}
		int result = csi.insert(customer);
		if (result > 0) System.out.println("<고객 등록에 성공했습니다.>");
	}

	private static void help() {
		System.out.println("* 다음 명령어 중에서 사용하시오. *");
		System.out.println("insert,id,암호,암호확인,이메일,이름");
		System.out.println("update,id,암호,암호확인,이메일,이름");
		System.out.println("delete,id");
		System.out.println("select,id");
		System.out.println("list");
		System.out.println("x");
		System.out.println();
	}	
}
