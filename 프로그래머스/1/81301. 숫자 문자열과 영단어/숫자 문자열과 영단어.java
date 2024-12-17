class Solution {
    public int solution(String s) {
        int answer = 0;
        //숫자 영단어를 담는 배열
        String[] number = {"zero", "one", "two", "three", "four",
                           "five",  "six", "seven", "eight", "nine"};
        
        //s의 영단어를 숫자로 치환(replace)
        for(int i=0; i<number.length; i++){
            s = s.replace(number[i], String.valueOf(i));
        }
        
        //String -> int 변환
        return answer = Integer.parseInt(s);
    }
}