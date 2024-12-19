import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //2차원 배열 조건의 값 하나를 뽑기 때문에, 길이만큼 배열 선언
        int[] answer = new int[commands.length];
        
        //2차원 배열의 조건 값을 저장할 동적 배열 선언
        ArrayList<Integer> list = new ArrayList<>();
        
        //2차원 배열 조회
        for(int i=0; i<commands.length; i++){
            //2차원 배열의 index 길이(-1의 이유: 배열 0부터 시작)
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            
            //index 길이만큼 임의의 동적배열에 추가
            for(int j=start; j<=end; j++){
                list.add(array[j]);
            }

            //정렬
            list.sort(null);
            //반환할 배열에 값 할당
            answer[i] = list.get(commands[i][2]-1);
            //임의의 동적배열 리셋
            list.clear();
        }
        return answer;
    }
}