import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer;
        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                if(j%queries[i][2]==0){
                    arr[j]++;
                }
            }
        }
        return answer = Arrays.copyOf(arr, arr.length); 
    }
}