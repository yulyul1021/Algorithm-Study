def recursion(s, l, r,answer):
    if l >= r: return 1,answer
    elif s[l] != s[r]: return 0,answer
    else:
        return recursion(s, l+1, r-1,answer+1)

def isPalindrome(s):
    answer = 1
    return recursion(s, 0, len(s)-1,answer)


num = int(input())

for i in range(num):
    str = input()
    a,b = isPalindrome(str)
    print(a,b)
