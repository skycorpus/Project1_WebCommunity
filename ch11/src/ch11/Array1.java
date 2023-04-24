package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Array1 {
	public static void main(String[] args) {
		//<E>는 Element 요소, 제네릭 Generic - 데이터 형을 정하는 것.
		//갯수가 정해지지 않음. 유동적.
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("구렁이"); al1.add("팔렁이"); //al1.add(888); 문자열이 아님
		al1.add("구렁삼"); al1.add("구렁사"); al1.add("구렁오");
		
		System.out.println("데이터 건수 : "+al1.size());
		for(int i=0; i<al1.size(); i++) { //for문
			System.out.print(al1.get(i)+"\t");
		}
		System.out.println();
		for(String str : al1) { //확장 for
			System.out.print(str+"\t");
		}
		System.out.println();
		Iterator<String> its = al1.iterator(); //Iterator
		while(its.hasNext()) { //가져올 다음 데이터 있는지?
			System.out.print(its.next()+"\t"); //다음 데이터 가져오기.
		}
	}
}
