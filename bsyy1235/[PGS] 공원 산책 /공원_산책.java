class Solution {
  public int[] solution(String[] park, String[] routes) {
    int[] answer = {};

    int[][] park_arr = new int[park.length][park[0].length()];
    int x = 0;
    int y = 0;

    for (int i = 0; i < park.length; i++) {
      for (int j = 0; j < park[0].length(); j++) {
        if (park[i].charAt(j) == 'S') {
          park_arr[i][j] = 1;
          x = i;
          y = j;
        }
        if (park[i].charAt(j) == 'X')
          park_arr[i][j] = -1;
        if (park[i].charAt(j) == 'O')
          park_arr[i][j] = 0;
      }
    }

    for (int i = 0; i < routes.length; i++) {
      String[] route = routes[i].split(" ");
      int tmp=0;

      switch (route[0]) {
        case "E":
          if(Integer.parseInt(route[1])+y<park[0].length()){
            tmp=y;
          for (int j = 0; j < Integer.parseInt(route[1]); j++) {
              if (park_arr[x][y + 1] == -1){
                y=tmp;
                break;
              }
              else
                y++;
            }
          }
          continue;

        case "S":
          if(Integer.parseInt(route[1])+x<park.length){
            tmp=x;
          for (int j = 0; j < Integer.parseInt(route[1]); j++) {
            if (x + 1 < park.length) {
              if (park_arr[x + 1][y] ==-1) {
                x=tmp;
                break;
              }
              else
                x++;
              }
          }
          }
          continue;

        case "W":
          if(y-Integer.parseInt(route[1])>=0){
            tmp=y;
          for (int j = 0; j < Integer.parseInt(route[1]); j++) {
              if (park_arr[x][y - 1] ==-1){
                y=tmp;
                break;
              }
              else
                y--;
          }
          }
          continue;
        case "N":
          if(x-Integer.parseInt(route[1])>=0){
            tmp=x;
          for (int j = 0; j < Integer.parseInt(route[1]); j++) {
              if (park_arr[x - 1][y]==-1){
                x=tmp;
                break;
              }
              else
                x--;
          }
        }
          continue;
      }
    }
    int[] ans = { x, y };
    answer = ans;

    return answer;
  }
}
