from sys import stdin
from collections import deque

n = int(stdin.readline().strip())
que = deque()

while True:
    input = int(stdin.readline().strip())
    if input == -1: break
    elif input == 0: que.popleft()
    elif len(que) >= n: pass
    else: que.append(input)


if len(que) != 0: print(*que)
else: print('empty')
