from sys import stdin

n = int(stdin.readline().strip())
words = [stdin.readline().strip() for _ in range(n)]

words.sort(key=lambda x:len(x))
res = 0

for i in range(n):
    flag = True
    for word in words[i+1:]:
        if word.startswith(words[i]): flag = False
    if flag: res+=1

print(res)
