import java.lang.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = (int) Math.sqrt(n);
        if(n%a==0){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}