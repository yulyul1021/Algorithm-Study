class Solution {
    int[][] answer = {};
    int i = 0;
    public void hanoi(int n, int from, int by, int to){
        if(n == 1) answer[i++] = new int[]{from, to};
        else {
            hanoi(n-1, from, to, by);
            answer[i++] = new int[]{from, to};
            hanoi(n-1, by, from, to);
        }
    }
    public int[][] solution(int n) {
        answer = new int[(int)Math.pow(2, n) - 1][];
        hanoi(n, 1, 2, 3);
        return answer;
    }
}
