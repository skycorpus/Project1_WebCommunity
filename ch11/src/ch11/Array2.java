package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Array2 {
	public static void main(String[] args) {
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("산딸기"); al2.add("집딸기"); al2.add("판딸기");
		al2.add("죽은딸기"); al2.add("알카리딸기"); al2.add("산딸기");
		
		System.out.println("딸기갯수 : "+al2.size());
		for(int i=0; i<al2.size();i++) { //일반 for문
			System.out.print(al2.get(i)+"\t");
		}
		System.out.println();
		for(String str : al2) { //확장 for문
			System.out.print(str+"\t");
		}
		System.out.println();
		Iterator<String> its = al2.iterator(); //Iterator 
		while(its.hasNext()) {
			System.out.print(its.next()+"\t");
		}
	}
}
