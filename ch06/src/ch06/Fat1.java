package ch06;

//factorial 팩토리얼 예제
public class Fat1 {
	public static void main(String[] args) {
		int[] nums = {3,4,5,6,7};
		for(int num:nums) {
			System.out.println(num+"계승 : "+fat1(num));
		}
		System.out.println("======================");
		for(int i=0; i<nums.length;i++) {
			System.out.println(nums[i]+"계승 : "+fat2(nums[i]));
		}
	}
	private static int fat2(int num) { //recursive(반복함수)
		if (num == 1) return 1;
		else return num * fat2(--num); // 3 * 2 * 1 => 6
	}
	private static int fat1(int num) { //recursive(반복함수)
		int result = 1;
		for(int i=num; i>0; i--) { // 3 * 2 * 1 => 6
			result *= i;
		}
		return result;
		
	}
}
