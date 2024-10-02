import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();;
        
        for(int i=0; i<queries.length; i++){
            int tmp1 = queries[i][0];
            int tmp2 = queries[i][1];
            
            
            int tmpValue = answer[tmp1];
            answer[tmp1] = answer[tmp2];
            answer[tmp2] = tmpValue;
        }
        return answer;
    }
}