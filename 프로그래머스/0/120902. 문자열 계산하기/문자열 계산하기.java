import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        //공백을 기준으로 문자열을 나누어 배열에 저장
        String tmp[] = my_string.split(" ");
        
        //배열의 첫번째 값은 숫자
        answer += Integer.parseInt(tmp[0]);
        
        //반복문과 조건문을 통해서 해당 연산자에 대한 값 계산
        for(int i=1; i<tmp.length; i++){
            if(tmp[i].equals("+")){
                answer += Integer.parseInt(tmp[i+1]);
            }else if(tmp[i].equals("-")){
                answer -= Integer.parseInt(tmp[i+1]);
            }
        }
        return answer;
    }
}