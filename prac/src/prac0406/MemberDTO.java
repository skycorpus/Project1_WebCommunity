package prac0406;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;
	
	public String toString() {
		return "Name = "+name+", Phone = "+phone+", email = "+email;
	}
	
	public boolean euqals(Object obj) {
		if(name.equals(((MemberDTO)obj).name)&&
				phone.equals(((MemberDTO)obj).phone)&&
				email.equals(((MemberDTO)obj).email))
				return true;
		return false;
	}
	
	public MemberDTO(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public static void main(String[] args) {
		MemberDTO dto=new MemberDTO("Sangmin", "010XXXYYYY", "javatuning@email.com");
		System.out.println(dto);
		MemberDTO dto1=new MemberDTO("Sangmin", "010XXXYYYY", "javatuning@email.com");
		if(dto.equals(dto1))
			System.out.println("동일인물");
		else
			System.out.println("다른인물"); //new로 새로 만들어서 정보가 같아도 저장된 주소값이 다르므로 다른인물 뜸.
	}
}
