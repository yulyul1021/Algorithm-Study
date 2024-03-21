from itertools import combinations

while True:
    arr = list(map(int, input().split()))
    if arr[0] == 0: break;

    ways = combinations(arr[1:], 6)
    for way in ways:
        print(*way)
    print()
