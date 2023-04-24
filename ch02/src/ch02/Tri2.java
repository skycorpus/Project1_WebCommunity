package ch02;

public class Tri2 {
	public static void main(String[] args) {
		int num = 243; // 게시판에 저장된 글 수 num이 270개일 경우도 계산
		int noOfPage = 10; /// 한 페이지에 글을 10개씩 게시
		int page = num % noOfPage == 0?num % noOfPage: num / noOfPage + 1 ; 
		// 몇 페이지가 필요할까요?
		System.out.printf("%d Postings are need to %d pages\n",num, page);
		
		int num270 = 270;
		int page2 = num270/noOfPage;
		System.out.println("270 page = " + page2);  // 틀림.
	}
}
