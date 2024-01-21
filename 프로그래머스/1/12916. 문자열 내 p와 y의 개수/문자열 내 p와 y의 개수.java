class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String supper= s.toUpperCase();
        int countP = 0;
        int countY = 0;
        for(int i=0; i<supper.length(); i++){
            char a= supper.charAt(i);
            if(a == 'P'){
                countP ++;
            }else if( a == 'Y'){
                countY ++;
            }
        }
        
        if(countP == countY){
            answer = true;
        }else{
            answer = false;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}