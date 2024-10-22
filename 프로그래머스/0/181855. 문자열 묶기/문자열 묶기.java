class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        int index[] = new int[31];
        
        for(String s: strArr){
            index[s.length()]++;
        }
        
        for(int i=0; i<index.length; i++){
            if(answer < index[i]){
                answer = index[i];
            }
        }
        return answer;
    }
}