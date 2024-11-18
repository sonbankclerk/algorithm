import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        
        //반복문을 통해 담을 동적 배열 생성
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            //list에 추가된 마지막 원소보다 크거나 같은 값을 비교하여 제거하는 반복문
            while(!list.isEmpty() && list.get(list.size()-1) >= arr[i]){
                list.remove(list.size()-1);
            }
            list.add(arr[i]);
        }   
        
        
        stk = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            stk[i] = list.get(i);
        }
        return stk;
    }
}