def solution(my_string, overwrite_string, s):
  start = my_string[0:s]
  end = my_string[s+len(overwrite_string):]

  answer = " "
  answer = start + overwrite_string + end
  return answer
