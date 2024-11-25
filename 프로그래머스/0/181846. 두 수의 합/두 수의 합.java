import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        //int, long의 범위를 넘는 정수 BigInteger 선언
        BigInteger tmp = new BigInteger(a);
        BigInteger tmp2 = new BigInteger(b);
        
        //biginteger 덧셈(add)
        BigInteger result = tmp.add(tmp2);
        
        //biginteger 형변환(String)
        return answer = result.toString();
    }
}