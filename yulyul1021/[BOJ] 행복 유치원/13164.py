from sys import stdin

n, k = map(int, stdin.readline().split())
numbers = list(map(int, stdin.readline().split()))

differs = [n2 - n1 for n1, n2 in zip(numbers, numbers[1:])]
differs.sort()

print(sum(differs[:n-k]))
