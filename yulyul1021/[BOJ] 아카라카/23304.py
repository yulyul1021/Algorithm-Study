def isPalindrome(s: str):
    return s == s[::-1]

def isAKARAKA(s):
    if len(s) == 1: return True
    elif not isPalindrome(s): return False
    else:
        return isAKARAKA(s[0:len(s)//2]) # 앞뒤 똑같으니 한쪽만 확인

s = input()
print('AKARAKA' if isAKARAKA(s) else 'IPSELENTI')
