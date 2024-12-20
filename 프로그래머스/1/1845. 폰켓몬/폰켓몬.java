import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        //중복제거를 위한 동적배열 생성
        ArrayList<Integer> list = new ArrayList<>();
        
        //매개변수 배열 중복제거
        for(int i=0; i<nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        
        //중복제거한 배열의 길이를 비교하여 return
        if(list.size()>nums.length/2){
            answer = nums.length/2;
        }else{
            answer = list.size();
        }
        return answer;
    }
}