class Solution {
    public int[] solution(long n) {
        String x = Long.toString(n);
        int[] answer = new int[x.length()];
        
        for(int i=0; i<x.length(); i++){
            answer[i] = Character.getNumericValue(x.charAt(x.length()-i-1));    
        }
        
        
        return answer;
    }
}