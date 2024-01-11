class Solution {
    public int[] solution(int brown, int yellow) {
        int by = brown + yellow;
        for(int i=1; i<2000000; i++){
            int x = i;
            int y = by / i;
            if(by % x == 0 && y <= x && brown == (x * y) - ((x-2)*(y-2)))
                return new int[]{x, y};
        }
        return new int[]{};
    }
}
