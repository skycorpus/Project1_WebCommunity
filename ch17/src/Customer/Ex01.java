package Customer;

import java.util.List;
import java.util.Scanner;

public class Ex01 {
	private static CustomerServiceImp1 cs = new CustomerServiceImp1();
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while(true) {
			help();
			String command = sc.nextLine();
			if (command.equals("6")) break;
			else if (command.equals("1")) insert();
			else if (command.equals("2")) update();
			else if (command.equals("3")) select();
			else if (command.equals("4")) delete();
			else if (command.equals("5")) list(); //Ex01.list()인데 클래스명 생략.
			else help();
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
	//static은 객체를 생성하지 않고 클래스명.메서드명으로 사용 가능.
	//클래스명(Ex01)과 main 클래스명과 같을 때는 클래스명 생략.
	private static void list() {
		System.out.println("목록을 조회합니다.");
		List<Customer> list = cs.list();
		if (list == null || list.size() == 0)
			System.out.println("데이터가 없습니다.");
		else
			for (Customer customer : list) {
				System.out.println(customer);
			}
	}

	private static void select() {
		System.out.println("조회할 아이디를 입력하세요.");
		String id = sc.nextLine();
		Customer customer = cs.select(id);
		if (customer == null) System.out.println("없는 데이터 입니다.");
		//객체를 print하면, Customer의 toString에 재정의한 내용대로 출력한다.
		//재정의 안하면 패키지명.클래스명@해시코드로 출력됨. 
		else System.out.println(customer);
	}

	private static void delete() {
		System.out.println("삭제할 아이디를 입력하세요.");
		String id = sc.nextLine();
		int result = cs.delete(id);
		if (result > 0) System.out.println("삭제 되었습니다.");
		else System.out.println("삭제에 실패했습니다.");
	}

	private static void update() {
		System.out.println("수정할 아이디를 입력하세요.");
		String id = sc.nextLine();
		System.out.println("암호를 입력하세요.");
		String pass = sc.nextLine();
		System.out.println("암호확인을 입력하세요.");
		String passConfirm = sc.nextLine();
		if (!pass.equals(passConfirm)) {
			System.out.println("암호와 암호확인이 다릅니다.");
			return;
		}
		System.out.println("이메일을 입력하세요.");
		String email = sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		//데이터를 묶어야 customer만 전달하면 id, pass, email, name이 같이 전달.
		Customer customer = new Customer(id, pass, email, name);
		int result = cs.update(customer);
		if (result > 0) System.out.println("수정성공");
		else System.out.println("수정에 실패했습니다.");
	}
	
	private static void insert() {
		System.out.println("아이디를 입력하세요.");
		String id = sc.nextLine();
		System.out.println("암호를 입력하세요.");
		String pass = sc.nextLine();
		System.out.println("암호확인을 입력하세요.");
		String passConfirm = sc.nextLine();
		if (!pass.equals(passConfirm)) {
			System.out.println("암호와 암호확인이 다릅니다.");
			return;
		}
		System.out.println("이메일을 입력하세요.");
		String email = sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		//데이터를 묶어야 customer만 전달하면 id, pass, email, name이 같이 전달.
		Customer customer = new Customer(id, pass, email, name);
		int result = cs.insert(customer);
		if (result > 0) System.out.println("입력성공");
		else System.out.println("입력에 실패했습니다.");
	}
	
	private static void help() {
		System.out.println("다음 중에서 선택하시오.");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 목록");
		System.out.println("6. 종료");
		System.out.print("명령번호 => ");
	}
}
