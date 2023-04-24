package customer;

import java.util.Collection;

public class CustomerServiceImp1 { //Business Model 업무처리
	private static CustomerDaoImp1 cdi = new CustomerDaoImp1();

	public int insert(Customer customer) { // 회원정보 k1,1,k1@k,철수,오늘
		int result = 0; //0은 입력실패, 1은 입력성공
		//map에 전달된 id를 읽어서 있으면 "이미 있는 아이디입니다. 다른것을 사용하세요." 출력. / 없으면 입력.
		//customer는 console로 입력받아서 전달받은 데이터, customer2는 map에서 읽어온 데이터.
		Customer customer2 = cdi.select(customer.getId()); //입력한 id로 읽기.
		if(customer2==null) result = cdi.insert(customer); //없으면 입력받기.
		else System.out.println("<이미 있는 아이디입니다. 다른것을 사용하세요.>");
		return result;
	}
	
	public Customer select(String id) {
		return cdi.select(id);
	}

	public int update(Customer customer){ //insert와 거의 비슷함.
		int result = 0; 
		Customer customer2 = cdi.select(customer.getId()); 
		if(customer2!=null) result = cdi.update(customer); 
		else System.out.println("<없는 아이디입니다. 수정이 불가능합니다.>");
		return result;
	}

	public int delete(String id) {
		int result = 0; 
		Customer customer2 = cdi.select(id); 
		if(customer2!=null) result = cdi.delete(id); 
		else System.out.println("<없는 아이디입니다. 삭제가 불가능합니다.>");
		return result;
	}

	public Collection<Customer> list() {
		return cdi.list();
	}
}
