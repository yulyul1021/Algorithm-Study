import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
      int[] answer = {};
      int person = 0;
      int times = 0;
      HashMap<Integer,String> map = new HashMap<>();

      map.put(0,words[0]);
      for(int i = 1;i<words.length;i++){
        if(map.containsValue(words[i])){
          person = i%n+1;
          times = i/n+1;
          break;
        }
        char[] arr = words[i].toCharArray();
        char[] arr1 = words[i-1].toCharArray();

        if(arr[0]!=arr1[arr1.length-1]){
          person = i%n+1;
          times = i/n+1;
          break;
        }
    
        map.put(i,words[i]);
      }

      int[] ans = {person,times};
      answer = ans;
      
      return answer;
    }
}
