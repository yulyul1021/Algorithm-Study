from sys import stdin

k = int(stdin.readline().strip())
numbers = list(map(int, stdin.readline().split()))
tree = [[] for _ in range(k)]

def make_tree(numbers, idx):
    mid = len(numbers) // 2
    tree[idx].append(numbers[mid])
    if len(numbers) == 1: return
    make_tree(numbers[:mid], idx+1)
    make_tree(numbers[mid + 1:], idx+1)

make_tree(numbers, 0)
for t in tree:
    print(*t)
