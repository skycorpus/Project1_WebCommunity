package Customer;

import java.util.List;

public class CustomerServiceImp1 { //Business Logic(Model) 업무처리.
	private static CustomerDaoImp1 cd = new CustomerDaoImp1();
	public int insert(Customer customer) {
		int result = 0;
		//customer는 Ex01에서 전달받는 데이터, customer2 아이디로 데이터 베이스에서 읽은 데이터.
		Customer customer2 = cd.select(customer.getId());
		if(customer2 == null) //없으면 입력받기.
			result = cd.insert(customer);
		else System.out.println("이미 있는 데이터 입니다.");
		return result;
		//데이터가 이미 있으면 result=0이고, 입력을 하면 result에 입력한 결과가 들어감.
	}
	
	public int update(Customer customer) {
		int result = 0;
		Customer customer2 = cd.select(customer.getId());
		if(customer2 == null) //해당하는 id로 데이터를 읽었을 때 데이터가 없다.
			System.out.println("없는 사용자입니다. 수정이 불가능합니다.");
		else result = cd.update(customer);
		return result;
	}

	public int delete(String id) {
		int result = 0;
		Customer customer2 = cd.select(id);
		if(customer2 == null)
			System.out.println("없는 사용자입니다. 삭제가 불가능합니다.");
		else result = cd.delete(id);
		return result;
	}
	
	public Customer select(String id) { 
		return cd.select(id);
	}

	public List<Customer> list() { //특별한 business logic 필요없음.
		return cd.list();
	}
}
