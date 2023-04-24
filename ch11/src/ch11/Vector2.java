package ch11;

import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>(5); //capacity(용량)이 5인 Vector 생성.
		vec.add("1"); vec.add("2"); vec.add("3"); prn(vec);
		vec.trimToSize(); prn(vec); //trimToSize : 데이터가 없는 공간을 삭제(용량과 크기가 같아짐)
		vec.ensureCapacity(6); prn(vec);//ensureCapacity : 용량을 6으로 선언한다.
		//데이터를 7개로 채워, 데이터가 용량을 넘어서면 현재용량이 2배로 커진다.
		//데이터를 지정하지 않고 size를 늘리면 숫자는 0으로 문자는 null로 채워진다.
		vec.setSize(7); prn(vec); 
		vec.clear(); prn(vec); //clear : 데이터 모두 삭제
	}

	private static void prn(Vector<String> vec) {
		System.out.println(vec);
		System.out.println("갯수 : "+vec.size()); //실제 데이터 건수
		System.out.println("용량 : "+vec.capacity()); //저장할 확보된 공간
		System.out.println();
	}
}
