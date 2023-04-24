package customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//DTO 형식으로 전달받은 데이터를 DB에 저장(map에 저장, 프로그램 종료하면 사라짐) 저장/조회/수정/삭제
//DTO : Data Transfer Object
//DAO : Date Access Object

public class CustomerDaoImp1 { 
	private Map<String, Customer> map = new HashMap<>();
	public Customer select(String id) { //id에 해당하는 값 customer
		return map.get(id); 
	}
	public int insert(Customer customer) { //k1,1,k1@k.com,철수,오늘날짜
		//        k1              k1,1,k1@k.com,철수,오늘날짜
		map.put(customer.getId(), customer);
		return 1;
	}
	public int update(Customer customer) {
		map.put(customer.getId(), customer); //현재 키에 해당하는 값을 덮어쓴다.
		return 1;
	}
	public int delete(String id) {
		map.remove(id); //현재 키에 해당하는 값을 덮어쓴다.
		return 1;
	}
	public Collection<Customer> list() {
		return map.values(); //map에서 모든 값만 추출 , map.keys();는 키만 추출.
	}
}
