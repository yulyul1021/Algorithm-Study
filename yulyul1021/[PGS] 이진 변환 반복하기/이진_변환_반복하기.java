class Solution {
    
    int[] count = new int[2];
    
    public String binaryConversion(String x){
        count[0]++;
        int c = x.replace("0", "").length();
        count[1] += x.length() - c;
        return Integer.toBinaryString(c);
    }
    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        while(!sb.toString().equals("1")){
            sb = new StringBuilder(binaryConversion(sb.toString()));
        }
        return count;
    }
}
