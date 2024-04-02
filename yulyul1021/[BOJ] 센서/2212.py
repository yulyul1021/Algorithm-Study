from sys import stdin

n = int(stdin.readline().strip())
k = int(stdin.readline().strip())

if k >= n:
    print(0)

else:
    coordinates = list(map(int, stdin.readline().split()))
    coordinates.sort()

    distance_diff = [c2 - c1 for c1, c2 in zip(coordinates, coordinates[1:])]
    for i in range(k - 1):
        distance_diff[distance_diff.index(max(distance_diff))] = 0


    print(sum(distance_diff))
