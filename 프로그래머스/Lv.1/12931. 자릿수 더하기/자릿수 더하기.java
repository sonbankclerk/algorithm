import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = n +"";
        for(int i=0; i<a.length(); i++){
            char b = a.charAt(i);
            answer += b - 48;
        }
        return answer;
    }
}