package ch11;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(); // 1, 2, 3, 4
		ArrayList<Integer> list2 = new ArrayList<>(); // 3, 4, 5, 6
		ArrayList<Integer> kyo = new ArrayList<>(); //교집합 //3, 4
 		ArrayList<Integer> hap = new ArrayList<>(); //합집합 //1, 2, 3, 4, 5, 6
		ArrayList<Integer> cha = new ArrayList<>(); //차집합 //1, 2
		ArrayList<Integer> cha2 = new ArrayList<>();//차집합2 //5, 6
		
		list1.add(1); list1.add(2); list1.add(3); list1.add(4);
		list2.add(3); list2.add(4); list2.add(5); list2.add(6);
		
		//교집합
		kyo.addAll(list1); kyo.retainAll(list2);
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println("교집합 : "+kyo);
		
		//합집합
		hap.addAll(list1); hap.removeAll(list2); hap.addAll(list2);
		System.out.println("합집합 : "+hap);
		
		//차집합
		cha.addAll(list1); cha.removeAll(list2);
		System.out.println("차집합 : "+cha);
		
		//차집합2
		cha2.addAll(list2); cha2.removeAll(list1);
		System.out.println("차집합2 : "+cha2);
	}
}

