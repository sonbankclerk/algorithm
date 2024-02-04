class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String a = phone_number.substring(0,phone_number.length()-4).replaceAll("[0-9]","*");
        String b = phone_number.substring(phone_number.length()-4,phone_number.length());
        answer = a+b;
        return answer;
    }
}