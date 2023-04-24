package prac0406;

public class BoxingUnboxing {
	public static void main(String[] args) {
		Integer iObj = new Integer(10);//박싱
		Double dObj = new Double(3.14);//박싱
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();
		
		int num1 = iObj.intValue(); //언박싱
		double num2 = dObj.doubleValue();//언박싱
		System.out.println(num1);
		System.out.println(num2);
		System.out.println();
		
		iObj = new Integer(iObj.intValue()+10);//언박싱 후 연산 그 후 다시 박싱
		dObj = new Double(dObj.doubleValue()+1.2);//언박싱 후 연산 그 후 다시 박싱
		System.out.println(iObj);
		System.out.println(dObj);
	}
}
