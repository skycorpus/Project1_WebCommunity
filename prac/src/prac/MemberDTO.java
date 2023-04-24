package prac;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;
	
	public String toString() {
		return "Name="+name+" Phone"+phone+" email="+email;
	}
	
	public boolean equals(Object obj) {
		if(name.equals((MemberDTO)obj).name)&&
			(phone.equals((MemberDTO)obj).phone)&&
			(email.equals((MemberDTO)obj).email)
			return false;
		
		return true;
	}
	
	public MemberDTO(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public static void main(String[] args) {
		MemberDTO dto = new MemberDTO("Sangmin", "010XXXYYYY","javatuning@gmail.com");
		System.out.println("Name="+dto.name+" Phone"+dto.phone+" email="+dto.email);
		MemberDTO dto1 = new MemberDTO("Sangmin", "010XXXYYYY","javatuning@gmail.com");
		if(dto.equals(dto1))
			System.out.println("동일 인물");
		else
			System.out.println("다른 인물"); //주소에 저장된 위치가 달라서 다른 인물로 나옴.
	}
}
