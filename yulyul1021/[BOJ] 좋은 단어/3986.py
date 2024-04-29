from sys import stdin

def is_good(word):
    arr = []
    for c in word:
        if len(arr) == 0:
            arr.append(c)
        elif arr[-1] == c:
            arr.pop()
        else:
            arr.append(c)
    return True if len(arr) == 0 else False


n = int(stdin.readline().strip())
words = [stdin.readline().strip() for _ in range(n)]

res = 0
for word in words:
    if is_good(word): res += 1
print(res)
