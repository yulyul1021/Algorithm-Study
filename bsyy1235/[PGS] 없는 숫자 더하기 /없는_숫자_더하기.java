class Solution {
    public int solution(int[] numbers) {
      int answer = -1;
      int[] num = new int[10];
      for(int i = 0; i < numbers.length; i++){
          num[numbers[i]]=numbers[i];
        }

      for(int i =0;i<num.length;i++){
        if(num[i]==0){
          answer+=i;
        }
      }
      if(answer!=-1)
        answer++;
   
      return answer;
    }
}
