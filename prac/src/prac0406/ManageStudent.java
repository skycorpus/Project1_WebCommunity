package prac0406;

import java.util.Objects;

class Student {
	String name;
	String address;
	String phone;
	String email;
	
	public Student(String name, String address, String phone, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((address == null) ? 0 :address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		
		return result;
	}

	//equals 메소드 작성시 규칙
	//재귀적 reflexive: null이 아닌 x에 대해 x.equals(x)는 항상 참
	//대칭적 symmetric: null이 아닌 x, y에 대해 x.equals(y)와 y.equals(x)의 결과는 같음
	//타동적 transitive: null이 아닌 x, y, z에 대해 x.equals(y)가 참이고 y.equals(z)가 참이면 x.equals(z)도 참
	//일관성 consistent: null이 아닌 x, y에 대해 x.equals(y)는 호출 시기와 관계없이 일정
	//null과의 비교: null이 아닌 x에 대해 x.equals(null)의 항상 거짓.
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		
		if(name == null) {
			if(other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		if(phone == null) {
			if(other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}
}

public class ManageStudent {
	public static void main(String[] args) {
		Student a = new Student("Min","Seoul","010XXXXXXXX","ask@godofjava.com");
		Student b = new Student("Min","Seoul","010XXXXXXXX","ask@godofjava.com");
		if(a.equals(b))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}
