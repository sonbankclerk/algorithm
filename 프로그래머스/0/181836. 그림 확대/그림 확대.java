class Solution {
    public String[] solution(String[] picture, int k) {
        //매개변수 picture와 k를 곱한 길이의 배열 선언
        String[] answer = new String[picture.length*k];
        int index = 0;
        
        //picture의 길이만큼 반복문 선언
        for(int i=0; i<picture.length; i++){
            StringBuilder sb = new StringBuilder();
            
            //picture의 문자를 k번 반복한 문자열
            for(int j=0; j<picture[i].length(); j++){
                sb.append(String.valueOf(picture[i].charAt(j)).repeat(k));
            }
            
            //k값만큼 반복하여 배열에 저장
            for(int j=0; j<k; j++){
                answer[index++] = sb.toString();
            }
        }
        return answer;
    }
}