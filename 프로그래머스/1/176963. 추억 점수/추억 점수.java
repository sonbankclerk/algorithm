class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i=0; i<photo.length; i++){
            int total = 0;
            for(int j=0; j<photo[i].length; j++){
                String person = photo[i][j];
                
                for(int k=0; k<name.length; k++){
                    if(person.equals(name[k])){
                        total += yearning[k];
                        break;
                    }
                }
            }
            answer[i] = total;
        }
        
        return answer;
    }
}