class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i=0; i<=9; i++){
            boolean a = false;
            for(int j=0; j<numbers.length; j++){
                if(i==numbers[j]){
                    a = true;
                    break;
                }
            }
            if(!a){
                answer += i;
            }
        }
        return answer;
    }
}