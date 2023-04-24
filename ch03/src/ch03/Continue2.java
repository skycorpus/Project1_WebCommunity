package ch03;

public class Continue2 {
	public static void main(String[] args) {
		outer : for(int i=0; i<10; i++) {
			for(int j = 1; j<10; j++) {
				System.out.println("안녕 : " + j);
			//	if(j>3) continue; // 안에 있는 for의 증감으로 간다.
				if(j>3) continue outer; //label outer에 있는 for의 증감으로 간다.
				System.out.println("안쪽 : " + j);
			}
			System.out.println("바깥 : " + i);
		}		
	}
}
