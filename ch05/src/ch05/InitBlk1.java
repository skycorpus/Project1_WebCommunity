package ch05;

//초기화블럭 예제
public class InitBlk1 {
	int[] k1 = new int[5];			//객체를 생성한 후에 사용가능
	static int[] k2 = new int[5];	//클래스를 로딩하면 바로 사용가능
	{ // 초기화 블럭, 객체를 사용한 후에 사용가능, 객체를 생성할 때 마다 실행
		for(int i=0; i<k1.length; i++) {
			k1[i] = (int)(Math.random()*20) + 1;
			//k2[i] = (int)(Math.random()*20) + 1; //있어도 Error는 아닌데 없어도 됨.
		}
	}
	static { //정적 초기화 블럭, 클래스를 로딩하면 바로 사용가능, 한번만 실행
		for(int i=0; i<k2.length; i++) {
			//k1[i] = (int)(Math.random()*20) + 1; //있으면 Error
			k2[i] = (int)(Math.random()*20) + 1;
		}
	}
}
