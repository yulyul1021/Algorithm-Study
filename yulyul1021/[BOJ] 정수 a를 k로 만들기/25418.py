A, K = map(int, input().split())
res = 0
dp = {A: 0, A + 1: 1}
for i in range(2, K + 1):   # A + 2부터
    if (A + i) % 2 == 0 and ((A + i) // 2) in dp.keys():
        dp[A + i] = dp.get((A + i) // 2) + 1
    else:
        dp[A + i] = dp[(A + i) - 1] + 1
print(dp.get(K))
