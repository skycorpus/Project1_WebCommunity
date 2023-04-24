package ch02;

public class Print1 {
	public static void main(String[] args) {
		System.out.printf("%d출력\n", 16);
		System.out.printf("%5d출력\n", 16); 
		//5칸 확보 -> 거기 16을 뒤에 넣음
		System.out.printf("%-5d출력\n", 16); 
		//5칸 확보 -> 16을 앞에서부터 넣음
		System.out.printf("%05d출력\n", 16); 
		//5칸 확보 -> 16을 뒤에 넣고, 빈칸을 0으로 채움
	}
}
