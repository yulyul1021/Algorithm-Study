import java.util.*;
class Solution {
	public static String[] solution(String[] strArr){
		String[] ans = {};
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i].indexOf("ad")==-1) {
				list.add(strArr[i]);
			}
		}
		ans = new String[list.size()];
		for(int i = 0;i<list.size();i++) {
			ans[i]=list.get(i);
		}
		return ans;
	}
}
