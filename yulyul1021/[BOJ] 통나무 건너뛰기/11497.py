from sys import stdin

t = int(stdin.readline().strip())

for _ in range(t):
    n = int(stdin.readline().strip())
    logs = list(map(int, stdin.readline().split()))
    logs.sort()

    logs_odd = logs[::2]
    logs_even = logs[1::2]
    logs = logs_odd + logs_even[::-1]
    diff = [abs(l1 - l2) for l1, l2 in zip(logs, logs[1:])]
    print(max(diff))
