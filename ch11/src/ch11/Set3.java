package ch11;

import java.util.HashSet;

public class Set3 {
	public static void main(String[] args) {
		String[] snakes = {"구렁이", "팔렁이", "구렁이", "칠렁이", "팔렁이", "육렁이"};
		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();
		for(String snake : snakes) {
			if(!hs1.add(snake)) //hs1에 snake 데이터를 입력하고 에러가 발생하면 
				hs2.add(snake); //입력안된 것만 hs2에 입력한다.
		}
		//완료한 후에 출력
		System.out.println(hs1);
		System.out.println(hs2);   //*중복되는 데이터인 팔렁이, 구렁이는 입력되지 않아 hs2에 입력됨.
		hs1.removeAll(hs2); //hs1애서 hs2에 있는 데이터를 모두 제거하라.
		
		System.out.println();
		System.out.println(hs1);
		System.out.println(hs2);
	}
}
