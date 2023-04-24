package ch10;

public class Throws2 {
	public static void main(String[] args) {
		int[] k = {12, 45, 0, 9, 32, 22};
		for(int i=0; i<k.length; i++) {
			try {
				m1(k[i]);
			} catch (Exception e) {
				System.out.println("대박에러 : "+e.getMessage());
			}
		}
	}
	
	static void m1(int k) throws ArithmeticException{
		  try { m2(k); } catch (Exception e) {
		  System.out.println("여기서 처리 : "+e.getMessage()); }
		 
	}
	
	private static void m2(int k) throws ArithmeticException{
			System.out.printf("%d / %d = %d\n", 100, k, 100/k);
	}
}
