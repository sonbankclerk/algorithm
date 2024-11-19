class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        //<= 일 경우, true = 1, false = 0
        if(ineq.equals("<") && eq.equals("=")){
            if(n<=m){
                return 1;
            }else{
                return 0;
            }
        //>= 일 경우 true = 1, false = 0
        }else if(ineq.equals(">") && eq.equals("=")){
            if(n>=m){
                return 1;
            }else{
                return 0;
            }
        //< 일 경우 true = 1, false = 0
        }else if(ineq.equals("<") && eq.equals("!")){
            if(n<m){
                return 1;
            }else{
                return 0;
            }
        //> 일 경우 true = 1, false = 0
        }else{
            if(n>m){
                return 1;
            }else{
                return 0;
            }
        }
        
    }
}