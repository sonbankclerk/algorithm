class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String a = Integer.toString(x);
        int result = 0;
        
        for(int i=0; i<a.length(); i++){
            result += Character.getNumericValue(a.charAt(i));
        }
        
        if(x%result == 0){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}