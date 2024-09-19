class Solution {
    public int[] solution(int[] arr) {
        int x = arr.length;
        
        int tmp= 1;
        while(tmp<x){
            tmp *= 2;
        }
        
        int[] answer = new int[tmp];
        
        for(int i=0; i<x; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}