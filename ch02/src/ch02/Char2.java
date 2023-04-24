package ch02;

public class Char2 {
 public static void main(String[] args) {
	 char c1 = 'A';
	 char c2 = '대'; //문자
	 //char c3 = "헐"; // ""는 문자열에만 가능 
	 //char c4 = 'aa' //문자열을 문자형 변수에 넣어서 오류 
	 char c5 = '\u0041'; // \\u는 유니코드라는 의미 (\이거 하나만 있으면 오류남.)
	 //char c6 = ''; //한 글자라 오류
	 System.out.println("c1 = " + c1);
	 System.out.println("c2 = " + c2);
	 System.out.println("c5 = " + c5);
 }
}

