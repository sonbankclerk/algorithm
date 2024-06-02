import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] x = new int[256];
        
        for(int i=0; i<256; i++){
            x[i] = -1;
        }
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(x[c] == -1){
                answer[i] = -1;
            }else{
                answer[i] = i-x[c];
            }
            x[c] = i;
        }
        
        return answer;
    }
}