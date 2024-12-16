import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        //매개변수에 주어진 값을 더 할 동적배열 선언
        ArrayList<Integer> list = new ArrayList<>();
        
        //이중 for문을 통해 매개변수 배열을 순환하며 더한다
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                //해당 값이 배열안에 중복되는 않는 경우에만 할당
                if(!list.contains(numbers[i]+numbers[j])){
                    list.add(numbers[i]+numbers[j]);    
                }
            }
        }
        
        //배열 오름차순 정렬
        Collections.sort(list);
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}