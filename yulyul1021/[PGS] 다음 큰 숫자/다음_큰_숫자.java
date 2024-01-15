class Solution {
    public int getNum1(String binaryString){
        return binaryString.replace("0", "").length();
    }
    public int solution(int n) {
        int answer = 0;
        int num1s = getNum1(Integer.toBinaryString(n));
        for(int i=n+1; ; i++) {
            if (num1s == getNum1(Integer.toBinaryString(i))){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
