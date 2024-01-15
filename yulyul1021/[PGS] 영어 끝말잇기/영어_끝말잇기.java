import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(words[0]);
        for(int i=1; i<words.length; i++){
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)
            || arrayList.contains(words[i]))
                return new int[]{i % n + 1, (int)Math.ceil((double) (i + 1) / n)};
            else arrayList.add(words[i]);
        }
        return new int[]{0, 0};
    }
}
