def solution(my_string):
    alp = "aeiou"
    answer = my_string
    for i in alp:
        answer = answer.replace(i,"")
    return answer