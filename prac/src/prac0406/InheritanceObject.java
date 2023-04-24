package prac0406;

public class InheritanceObject {
	public String toString() { //toString 메소드 오버라이딩
		return "InheritanceObject class";
	}
	
	public static void toStringMethod(InheritanceObject obj) {
		//println이 Object 타입일 경우 obj.toString()을 수행한 결과를 println(String) 형태로 다시 호출.
		System.out.println(obj);
		System.out.println(obj.toString());//위와 동일한 결과.
		System.out.println("plus"+obj);
		System.out.println(obj.getClass().getName()+'@'+Integer.toHexString(obj.hashCode()));
		//Object 클래스의 toString은 getClass().getName()+'@'+Integer.toHexString(obj.hashCode())와 동일.
		//getClass(): Class라는 클래스의 객체를 만들어줌.
		//Class: 특정 객체가 소속된 클래스의 정보를 담은 객체를 만들어 주는 클래스
		//getName(): 해당 Class객체에 정의된 클래스 이름 반환
		//hashCode(): 객체의 해시값을 계산해주는 메소드.
	}
	
	public static void main(String[] args) {
		toStringMethod(new InheritanceObject());
	}
}
