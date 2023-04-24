package ch09;

public class String4 {
	public static void main(String[] args) {
		String str = "우리는 친구였어, 곁에 있으면 든든한 친구";
		//뒤부터 출력
		for(int i=str.length() - 1; i>=0; i--) { //거꾸로 출력
			//charAt 문자 하나씩 
			System.out.print(str.charAt(i));
		}
				
	}
}
