class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        //메서드 체이닝: 불변객체를 객체 변경 없이 새로운 객체로 반환
        numbers = numbers.replaceAll("one", "1")
                        .replaceAll("two", "2")
                        .replaceAll("three", "3")
                        .replaceAll("four", "4")
                        .replaceAll("five", "5")
                        .replaceAll("six", "6")
                        .replaceAll("seven", "7")
                        .replaceAll("eight", "8")
                        .replaceAll("nine", "9")
                        .replaceAll("zero", "0");
        
        //반환 타입: Long
        return answer = Long.parseLong(numbers);
    }
}