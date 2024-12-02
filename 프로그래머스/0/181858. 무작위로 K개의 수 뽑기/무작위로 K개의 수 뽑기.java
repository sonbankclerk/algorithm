import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        //k 개수만큼 배열 객체 생성
        int[] answer = new int[k];
        
        //arr을 순회하면서 저장한 임의의 동적 배열 생성
        ArrayList<Integer> list = new ArrayList<>();
        
        //arr배열에 중복값 제거
        for(int i=0; i<arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        
        //중복되지 않는값 저장 후 나머지 -1값 배열의 길이만큼 저장
        for(int i=0; i<answer.length; i++){
            if(i<list.size()){
                answer[i] = list.get(i);
            }else{
                answer[i] = -1;
            }
        }
        return answer;
    }
}