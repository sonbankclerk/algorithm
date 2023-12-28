class Solution {
    public int[] solution(int n, int k) {
        int count = n/k;
        int[] answer = new int[count];
        int sum = 0;
        
        for(int i=0; i<count; i++){
            sum += k;
            answer[i] = sum;
        }
        
        return answer;
    }
}