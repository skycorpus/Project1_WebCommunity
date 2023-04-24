package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Set1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("사과"); set.add("포도"); set.add("사과");
		set.add("키위"); set.add("바나나"); set.add("바나나"); 
		System.out.println("갯수 : "+set.size());
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //중복되는 데이터는 안들어갔음.
		}
		System.out.println("==============");
		for(String str : set) {
			System.out.println(str); //인덱스가 없으니 순서가 뒤죽박죽.
		}
	}
}
