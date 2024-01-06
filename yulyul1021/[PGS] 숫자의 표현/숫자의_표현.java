class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 1;
        while(true){
            int sum = 0;
            for(int i=start; sum < n; i++){
                sum += i;
                if(sum == n){ answer++; start++; break; }
                else if(sum > n) { start++; break; }
            }
            if(start > n) break;
        }
        return answer;
    }
}
