import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int t : tangerine)
            hm.put(t, hm.getOrDefault(t, 0) + 1);
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(hm.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        int sum = 0;
        int answer = 0;
        for(var e : entryList){
            answer++;
            if((sum += e.getValue()) >= k) return answer;
        }
        return answer;
    }
}
