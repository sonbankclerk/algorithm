import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(list.isEmpty() || !list.get(list.size()-1).equals(arr[i])){
                list.add(arr[i]);
            }else{
                list.remove(list.size()-1);
            }
        }
        
        if(list.isEmpty()){
            return new int[]{-1};
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}