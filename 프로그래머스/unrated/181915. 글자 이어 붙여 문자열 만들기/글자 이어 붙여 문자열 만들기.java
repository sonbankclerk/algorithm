import java.lang.StringBuilder;
class Solution {
    public String solution(String my_string, int[] index_list) {
        // String answer = "";
        StringBuilder answer = new StringBuilder();
        
        for(int index : index_list){
            answer.append(my_string.charAt(index));
        }
        
        return answer.toString();
    }
}