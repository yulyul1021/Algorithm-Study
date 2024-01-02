import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int[] numbers = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = numbers[0], max = numbers[0];
        for(var n : numbers){
            if(min > n) min = n;
            if(max < n) max = n;
        }
        return min + " " + max;
    }
}
