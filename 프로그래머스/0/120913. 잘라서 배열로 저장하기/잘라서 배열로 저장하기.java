class Solution {
    public String[] solution(String my_str, int n) {
        int tmp = 0;
        if(my_str.length()%n!=0){
            tmp = (my_str.length()/n)+1;
        }else{
            tmp = my_str.length()/n;
        }
        
        String[] answer = new String[tmp];
        
        for(int i=0; i<tmp; i++){
            int start = i*n;
            int end = Math.min(start+n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}