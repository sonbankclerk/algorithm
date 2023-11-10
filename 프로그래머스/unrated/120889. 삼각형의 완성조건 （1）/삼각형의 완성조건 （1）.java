import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        for(int i : sides){
            if(sides[2]<sides[0]+sides[1]){
                return answer =1;
            }else{
                return answer =2;
            }
        }
        
        return answer;
    }
}