package algorithm;

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        while(num1 < 0) {
            num1++;
        }
        while(num1>100) {
        	num1--;
        }
        while(num2 < 0) {
            num2++;
        }
        while(num2>100) {
        	num2--;
        }
        
        answer=num1*num2;
        return answer;
    }
}
