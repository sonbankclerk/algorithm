class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
           int result = array[i];
            if(result>height){
                answer++;
            }
            
        }
        return answer;
    }
}