package ch10;

public class Throws1 {
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace(); //에러가 난 곳을 추적해서 출력해줌.
		}
	}

	private static void m1() throws Exception {
		m2(); 
		/* try { m2(); } catch (Exception e) {
		 * System.out.println("내가 해야겠네 : "+e.getMessage()); }
		 */
	}

	private static void m2() throws Exception {
		throw new Exception("쪽박 에러");
	}
}
