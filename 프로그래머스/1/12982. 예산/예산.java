import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        //배열의 정수를 순차적으로 나열
        Arrays.sort(d);
        
        //주어진 금액보다 나열한 배열의 수가 커질때까지 빼며 개수를 구한다.
        for(int i=0; i<d.length; i++ ){
            if(budget>=d[i]){
                budget -= d[i];
                answer ++;
            }
        }
       
        return answer;
    }
}