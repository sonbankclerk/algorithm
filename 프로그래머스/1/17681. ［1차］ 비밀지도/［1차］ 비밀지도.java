class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        //정사각형 배열 길이 만큼 n할당
        String[] answer = new String[n];
        
        //toBinaryString: 10진수 -> 2진수 변환, arr1[]|arr2[]: or비트연산
        for(int i=0; i<n; i++){
            answer[i] = Integer.toBinaryString(arr1[i]|arr2[i]);
        }
        
        //%ns: n자리수 만큼, 1=>#, 0=>공백 으로 변환
        for(int i=0; i<n; i++){
            answer[i] = String.format("%"+n+"s", answer[i]).replace('1', '#');
            answer[i] = String.format("%"+n+"s", answer[i]).replace('0', ' ');
        }
        
        //이전 풀이        
        /*String[] tmpArr1 = new String[arr1.length];
        String[] tmpArr2 = new String[arr2.length];
        
        int maxLength = Math.max(Integer.toBinaryString(arr1[0]).length(),
                                Integer.toBinaryString(arr2[0]).length());
        
        for(int i=1; i<arr1.length; i++){
            maxLength = Math.max(maxLength, Integer.toBinaryString(arr1[i]).length());
            maxLength = Math.max(maxLength, Integer.toBinaryString(arr2[i]).length());
        }
        
        for(int i=0; i<arr1.length; i++){
            tmpArr1[i] = Integer.toBinaryString(arr1[i]);
            tmpArr1[i] = String.format("%" + maxLength + "s", tmpArr1[i]).replace(' ', '0');
            
            tmpArr2[i] = Integer.toBinaryString(arr2[i]);
            tmpArr2[i] = String.format("%" + maxLength + "s", tmpArr2[i]).replace(' ', '0');
        }
        
        for(int i=0; i<arr1.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<maxLength; j++){
                if(tmpArr1[i].charAt(j) == '1' || tmpArr2[i].charAt(j) == '1'){
                    sb.append('#');
                }else{
                    sb.append(' ');
                }
            }
            answer[i] = sb.toString();
        }*/
        return answer;
    }
}