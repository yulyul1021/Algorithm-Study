import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
      int[] answer = {};
      int[] ans = new int[commands.length];

      for(int i=0;i<commands.length;i++){
        LinkedList<Integer> arr = new LinkedList<>();
        for(int j =commands[i][0]-1;j<commands[i][1];j++)
          arr.add(array[j]);
        Collections.sort(arr);
        ans[i] = arr.get(commands[i][2]-1);
      }
      answer = ans;

      return answer;
    }
}
