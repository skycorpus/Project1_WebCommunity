package ch09;

public class String3 {
	public static void main(String[] args) {
				//    0123 456789 012 3456 7890 12
		String str = "우리는 친구였어, 곁에 있으면 든든한 친구";
		
		System.out.println(str.substring(5, 10));//index 5번째부터 10번 앞까지 출력
		System.out.println(str.substring(4));//index 4번째부터 끝까지 출력
		System.out.println("=====================");
		
		System.out.println(str.indexOf("친"));//앞에서부터 센 "친"의 인덱스 번호
		System.out.println(str.lastIndexOf("친"));//뒤에서부터 센 "친"의 인덱스 번호
		System.out.println("=====================");
		
		System.out.println(str.startsWith("우"));//문장이 "우"로 시작하는지 여부
		System.out.println(str.endsWith("친"));//문장이 "친"으로 끝나는지 여부
		System.out.println("=====================");
		
		System.out.println(str.contains("대"));//문장에 "대"가 포함되어 있는지 여부
		System.out.println("=====================");
		
		String[] str2 = str.split(" ");//문장을 띄어쓰기를 기준으로 배열로 만들어 출력
		for(String a:str2) {
			System.out.println(a);
		}
		System.out.println("=====================");
		
		
		System.out.println(str.length());//글자수 
	}
}