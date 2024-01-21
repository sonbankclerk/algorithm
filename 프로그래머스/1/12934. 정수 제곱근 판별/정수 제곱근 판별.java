import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = 0;
        long result = (long)Math.sqrt(n);
        if(result * result == n){
            answer = (result+1) * (result+1);
        }else{
            answer = -1;
        }
        return answer;
    }
}