class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        for(int i=0; i<=t.length()-len; i++){
            String a = t.substring(i, i+len);
            if(Long.parseLong(a)<=Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}