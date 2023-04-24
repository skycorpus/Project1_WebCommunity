package prac0406;

public class AutoBoxingUnboxing {
	public static void main(String[] args) {
		Integer iObj = 10; //오토박싱
		Double dObj = 3.14;//오토박싱
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();
		
		int num1 = iObj;   //오토 언박싱
		double num2 = dObj;//오토 언박싱
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();
		
		iObj++;//오토 박싱, 오토 언박싱 동시 진행
		System.out.println(iObj);
		iObj += 3;
		System.out.println(iObj);
		
		int r = iObj + 5;//오토 언박싱
		Integer rObj = iObj - 5; //오토 언박싱, 오토 박싱 진행
		System.out.println(r);
		System.out.println(rObj);
	}
}
