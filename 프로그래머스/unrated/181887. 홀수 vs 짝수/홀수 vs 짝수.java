class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a=0;
        int b=0;
        for(int i=0; i<num_list.length; i+=2){
            a += num_list[i];
        }
        
        for(int j=1; j<num_list.length; j+=2){
            b += num_list[j];
        }
        
        if(a>b){
            answer =a;
        }else {
            answer =b;
        }
        return answer;
    }
}