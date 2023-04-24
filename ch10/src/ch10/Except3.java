package ch10;

public class Except3 {
	public static void main(String[] args) {
		int[] x = {12,45,25,0,17};
		//100을 x[0]~x[5]까지 숫자로 나눠서 출력
		//예외가 발생하면 처리하는 catch문
		//마지막은 그냥 Exception으로 처리
		//finally 재밌다 출력
		for(int i=0; i<=5;i++) {
		try {
			System.out.printf("%d / %d = %d\n", 100, x[i], 100/x[i]);
		}catch(Exception e){
			System.out.println(e.getMessage());
			}
		finally {
			System.out.println("재밌다.");
			}
		}
	}
}
