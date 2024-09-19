class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String tmp = k+"";
        for(int x=i; x<=j; x++){
            String tmp2 = x+"";
            for(int z=0; z<tmp2.length(); z++){
                if(tmp2.charAt(z) == tmp.charAt(0)){
                    answer++;
                }
            }
            
        }
        return answer;
    }
}