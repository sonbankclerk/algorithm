def solution(numbers):
    numbers.sort()
    tmp = numbers
    answer = tmp[len(tmp)-1] * tmp[len(tmp)-2]
    return answer