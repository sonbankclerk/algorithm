import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";

        //문자열을 배열에 담는다
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            list.add(String.valueOf(my_string.charAt(i)));
        }
        
        //이차원 배열에 주어진 범위 만큼 뒤집는다
        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            
            //Collections.reverse(): 리스트 순서 뒤집는 메서드
            //subList(): 리스트의 부분을 참조하여 서브리스트를 생성하는 메서드
            Collections.reverse(list.subList(start, end+1));
        }
        
        for(String s : list){
            answer += s;
        }
        return answer;
    }
}