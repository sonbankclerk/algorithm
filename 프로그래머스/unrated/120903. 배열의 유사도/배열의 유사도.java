class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        // s1 = new String[s1.length];
        // s2 = new String[s2.length];
        for(int i=0; i<s1.length; i++){
            for(int j=0; j<s2.length; j++){
                if(s1[i].equals(s2[j])){
                    answer++;
                }
            }
        }
        return answer;
    }
}