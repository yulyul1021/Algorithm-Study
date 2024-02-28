class Solution {
    public String solution(String s) {
     String answer = "";

      String[] list = s.split(" ");
      int max, min;

      max = min = Integer.parseInt(list[0]);

      for(int i =0;i<list.length;i++){
        if(Integer.parseInt(list[i])>=max)
          max = Integer.parseInt(list[i]);
        else if(Integer.parseInt(list[i])<=min)
          min=Integer.parseInt(list[i]);
      }

      answer = new String();
      answer = min+" "+max;


      return answer;
    }
}
