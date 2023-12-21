class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String stra = Integer.toString(a);
        String strb = Integer.toString(b);
        String strab = stra+strb;
        String strba = strb+stra;
        
        int ab = Integer.parseInt(strab);
        int ba = Integer.parseInt(strba);
        
        if(ab>=ba){
            answer= ab;
        }else{
            answer =ba;
        }
        return answer;
    }
}