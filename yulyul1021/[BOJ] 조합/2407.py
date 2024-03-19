def fac(n):
    res = 1
    for i in range(2, n + 1):
        res *= i
    return res

n, m = map(int, input().split())
print(fac(n) // (fac(n-m) * fac(m)))

# 혹은

import math

n, m = map(int, input().split())
print(math.comb(n, m))
