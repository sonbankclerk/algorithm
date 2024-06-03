class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for(int i=0; i<strings.length; i++){
            answer[i] = strings[i];
        }
        
        for(int i=0; i<answer.length-1; i++){
            for(int j=i+1; j<answer.length; j++){
                char c1 = answer[i].charAt(n);
                char c2 = answer[j].charAt(n);
                
                if(c1>c2){
                    String x = answer[i];
                    answer[i] = answer[j];
                    answer[j] = x;
                }else if(c1 == c2){
                    if(answer[i].compareTo(answer[j])>0){
                        String x = answer[i];
                        answer[i] = answer[j];
                        answer[j] = x;
                    }
                }
            }
        }
        
        return answer;
    }
}