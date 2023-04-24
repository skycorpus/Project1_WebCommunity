package prac;

import java.util.Objects;

class Student {
	String name;
	String address;
	String phone;
	String email;
	
	public MemberDTO(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, email, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

}

public class ManageStudent {
	public static void main(String[] args) {
		Student a = new Student("Min","Seoul","010XXXYYYY")
	}
}
