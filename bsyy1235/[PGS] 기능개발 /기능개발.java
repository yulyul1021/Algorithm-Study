import java.util.*;
import java.math.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
      int[] answer = {};
      LinkedList<Integer> list = new LinkedList<Integer>();
      LinkedList<Integer> cnt = new LinkedList<>();

      for(int i=0;i<progresses.length;i++)
        list.add((int)Math.ceil((100.0-(double)progresses[i])/speeds[i]));

      while(true){
        if(list.isEmpty())
          break;
        
        int count = 0;
        int list_0 = list.get(0);

        while(true){
          if(list.isEmpty())
            break;
          if(list_0 >= list.element()){
            list.remove();
            count++;}
          else
            break;
        }
        cnt.add(count);
      }
      answer = new int[cnt.size()];

      for(int i =0;i<answer.length;i++){
        answer[i]=cnt.get(i);
      }

      return answer;
  }
}
