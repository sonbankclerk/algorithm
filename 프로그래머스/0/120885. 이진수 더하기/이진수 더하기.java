class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        String tmp ="";
        int bin1Tmp = 0;
        int bin2Tmp = 0;
        
        //2진수 -> 10진수
        int count = 1;
        for(int i=bin1.length()-1; i>=0; i--){
            bin1Tmp += Integer.parseInt(String.valueOf(bin1.charAt(i)))*count;
            count*=2;
        }
        
        count = 1;
        for(int i=bin2.length()-1; i>=0; i--){
            bin2Tmp += Integer.parseInt(String.valueOf(bin2.charAt(i)))*count;
            count*=2;
        }
        
        //10진수 더한 값
        int result = bin1Tmp + bin2Tmp;
        
        //10진수가 0일 때 값 처리
        if(result == 0){
            return "0";
        }
        
        //더한 10진수 -> 2진수
        while(result>0){
            tmp += String.valueOf(result%2);
            result /=2;
        }
        
        //2진수 정렬 후 리턴
        for(int i=tmp.length()-1; i>=0; i--){
            answer += String.valueOf(tmp.charAt(i));
        }
        return answer;
    }
}