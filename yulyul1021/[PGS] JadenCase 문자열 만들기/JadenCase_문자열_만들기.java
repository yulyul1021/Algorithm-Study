import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s.toLowerCase(), " ", true);
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            if(token.equals(" ")) sb.append(" ");
            else{
                sb.append(Character.toUpperCase(token.charAt(0)))
                        .append(token.substring(1));
            }
        }
        return sb.toString();
    }
}
