package ch02;

/*작성자: 
  작성일: 2023.02.16
  제목: 바구니 연습문제 - 삼항조건 연산자*/
public class Ex01 {
	public static void main(String[] args) {
		int numOfApples = 123; // 사과의 갯수
		int sizeOfBucket = 10;
		// 바구니의 크기(바구니에 담을 수 있는 사과의 갯수)
		// int numOfBucket = (numOfApples / sizeOfBucket);
		/// System.out.printf("담은사과 %d개\n" ,numOfBucket);
		// System.out.printf("남은사과 %d개\n", (numOfApples % sizeOfBucket));

		int numOfBucket = (numOfApples % sizeOfBucket) == 0 ? numOfApples / sizeOfBucket
				: numOfApples / sizeOfBucket + 1;
		System.out.printf("바구니 갯수 : %d개\n", numOfBucket);

	}
}
