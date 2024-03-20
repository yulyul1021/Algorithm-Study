import math


def get_num_prime(n):
    arr = [True for i in range(2 * n + 1)]
    arr[0] = False
    arr[1] = False
    for i in range(2, int(math.sqrt(2 * n)) + 1):
        if arr[i]:
            j = 2
            while i * j <= (2 * n):
                arr[i * j] = False
                j += 1

    res = 0
    for i in range(n + 1, 2 * n + 1):
        res = res + 1 if arr[i] else res
    return res


while True:
    n = int(input())
    if n == 0: break;
    print(get_num_prime(n))
