package ch11;

import java.util.ArrayList;

public class Array3 {
	public static void main(String[] args) {
		ArrayList<String> snakes = new ArrayList<>();
		snakes.add("구렁이"); snakes.add("팔렁이"); snakes.add("구렁삼");
		snakes.add("구렁사"); snakes.add("구렁이"); prn(snakes);
		// add는 추가, set은 바꿔치기.
		snakes.add(1,"구렁오"); prn(snakes); //index 1에 구렁이 추가
		snakes.set(4, "도마뱀"); prn(snakes);//인덱스 5번째 값을 변경
		snakes.remove(2); prn(snakes); //해당하는 인덱스를 지우면 인덱스가 지운만큼 당겨진다.
		snakes.remove("구렁이"); prn(snakes); //처음 발견된 구렁이를 지우고 인덱스가 하나씩 당겨짐.
	}

	private static void prn(ArrayList<String> snakes) {
		for(String snake:snakes)
			System.out.print(snake + "\t");
		System.out.println();
	}
}

