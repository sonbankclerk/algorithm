class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split(" ", -1);
        for(int i=0; i<a.length; i++){
            String b = a[i];
            for(int j=0; j<b.length(); j++){
                char c = b.charAt(j);
                if(j%2==0){
                    answer += Character.toUpperCase(c);
                }else{
                    answer += Character.toLowerCase(c);
                }
            }
            if(i<a.length-1){
                answer += " ";
            }
            
        }
        return answer;
    }
}