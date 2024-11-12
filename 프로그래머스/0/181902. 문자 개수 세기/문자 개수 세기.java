class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        //아스키코드 A=65, a=97
        char tmp = 65;
        char tmp2 = 97;
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<52; j++){
                //0~25번째 대문자 비교
                if(j<26 && my_string.charAt(i) == tmp+j){
                    answer[j] += 1;
                }
                //26~51번째 소문자 비교
                //소문자 비교는 j가 26부터 시작이므로 -26을 통해서 '97+0=a'가 되도록 만들어주었다.
                if(j>25 && my_string.charAt(i) == tmp2+(j-26)){
                    answer[j] += 1;
                }
            }
        }
        return answer;
    }
}