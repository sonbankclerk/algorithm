class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int maxSide = Math.max(sides[0],sides[1]);
        int minSide = Math.min(sides[0],sides[1]);
        int otherSide = maxSide;

        if(sides[0] + sides[1] <= 3){
            return 1;
        }else{
            for(int i=maxSide-minSide+1; i<=maxSide; i++){
                if(i<=maxSide){
                    answer += 1;
                }
            }
            for(int i=maxSide; i<maxSide+minSide-1; i++){
                if(otherSide<maxSide+minSide){
                    answer += 1;
                    otherSide ++;
                }
            }
        }
        return answer;
    }
}