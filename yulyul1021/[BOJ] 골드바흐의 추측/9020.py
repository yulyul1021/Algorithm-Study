primes = [True for i in range(10001)]
primes[0] = False
primes[1] = False

for i in range(2, 10001):
    if primes[i]:
        for j in range(i * 2, 10001, i):
            primes[j] = False


t = int(input())
for i in range(t):
    n = int(input())
    add1 = 0
    add2 = 0
    for j in range(n // 2 + 1):
        if primes[j] and primes[n - j]:
            add1 = j
            add2 = n - j
    print(add1, add2)
