class Solution {
    public String solution(int n) {
        String answer = "";
        String a = "수박";
        String b = a.repeat(n);
        
        answer = b.substring(0, n);
        return answer;
    }
}