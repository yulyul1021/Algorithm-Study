class Solution {
    public int solution(int n) {
        int answer = 0;
        int num0 = 0, num1 = 1;
        for(int i=2; i<=n; i++) {
            answer = (num0 + num1) % 1234567;
            num0 = num1;
            num1 = answer;
        }
        return answer;
    }
}
