primes = [True for i in range(1000001)]
primes[0] = False
primes[1] = False

for i in range(2, 1000001):
    if primes[i]:
        for j in range(i * 2, 1000001, i):
            primes[j] = False


t = int(input())
for i in range(t):
    n = int(input())
    res = 0
    for j in range(n // 2 + 1):
        if primes[j] and primes[n - j]:
            res += 1
    print(res)
