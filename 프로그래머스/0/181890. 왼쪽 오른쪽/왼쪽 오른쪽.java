import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        
        //반복문을 통해 str_list배열을 순환하며 문자열 확인
        for(int i=0; i<str_list.length; i++){
            //문자열이 l일때, 왼쪽에 있는 문자열 순서대로 담기
            if(str_list[i].equals("l")){
                for(int j=0; j<i; j++){
                    list.add(str_list[j]);
                }
                break;
            }
            //문자열이 r일때, 오른쪽에 있는 문자열 순서대로 담기
            if(str_list[i].equals("r")){
                for(int j=i+1; j<str_list.length; j++){
                    list.add(str_list[j]);
                }
                break;
            }
        }
        
        //list에 해당하는 배열 값을, answer 배열로 return
        answer = new String[list.size()];
        list.toArray(answer);
        return answer;
    }
}