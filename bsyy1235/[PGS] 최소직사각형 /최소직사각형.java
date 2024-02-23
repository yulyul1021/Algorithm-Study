class Solution {
    public int solution(int[][] sizes) {
      int answer = 0;

      for(int i = 0;i<sizes.length;i++){
        if(sizes[i][0]<sizes[i][1]){
          int tmp;
          tmp = sizes[i][0];
          sizes[i][0]=sizes[i][1];
          sizes[i][1]=tmp;
        }
      }

      int maxA = 0;; 
      int maxB = 0;
      for(int i = 0;i<sizes.length;i++){
        if(sizes[i][0]>maxA)
          maxA=sizes[i][0];
        if(sizes[i][1]>maxB)
          maxB=sizes[i][1];
      }

      answer = maxA*maxB;

      
      return answer;
    }
}
