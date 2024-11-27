import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //quereis의 길이에 맞춰 answer 배열 선언
        int[] answer = new int[queries.length];
        //조건에 맞는 값을 저장한 list 선언
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<queries.length; i++){
            //query의 s<i<e 사이의 k보다 큰 수 list 배열에 저장
            for(int j=queries[i][0]; j<queries[i][1]+1; j++){
                if(arr[j]>queries[i][2]){
                    list.add(arr[j]);
                }
            }
            
            //list 객체 값 중 가장 작은 값 answer 배열에 저장
            //list가 비어 있으면 -1
            if(!list.isEmpty()){
                answer[i]  = Collections.min(list); //가장 작은 값 저장
                list.clear(); //list 초기화
            }else{
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}