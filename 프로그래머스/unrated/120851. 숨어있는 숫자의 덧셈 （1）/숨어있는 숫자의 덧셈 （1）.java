class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String a = my_string.replaceAll("[^0-9]","");
        for(int i =0; i<a.length(); i++){
            answer += Character.getNumericValue(a.charAt(i));
        }
        return answer;
    }
}