def solution(n):
  answer = []
  str1 = str(n)
  reverse = reversed(str1)

  for i in reverse:
    answer.append(int(i))
  
  return answer
