class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        //가로:w, 세로:h
        int w = 0;
        int h = 0;
        
        //2차원 배열 조회하면서, 두 변의 길이중 큰값을 w, 작은값을 h에 할당
        //할당된 w,h의 값을 비교하며 최소직사각형의 합 도출
        for(int i=0; i<sizes.length; i++){
            if(Math.max(sizes[i][0], sizes[i][1])>=w){
                w = Math.max(sizes[i][0], sizes[i][1]);
            }
            if(Math.min(sizes[i][0], sizes[i][1])>=h){
                h = Math.min(sizes[i][0], sizes[i][1]);
            }

        }

        return answer = w*h;
    }
}