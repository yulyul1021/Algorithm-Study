def solution(n):
    result=""

    while(n>0):
        n-=1
        result = "124"[n%3] + result
        n//=3

    return result
