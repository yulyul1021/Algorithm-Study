num_paper = [0, 0, 0]


def all_same_number(m: list[list[int]]):
    compare = m[0][0]
    for row in m:
        for element in row:
            if element != compare:
                return False
    return True


def cut_paper(m):
    if all_same_number(m):
        num_paper[m[0][0] + 1] += 1
    else:
        length = len(m) // 3
        for i in range(3):
            for j in range(3):
                cut_paper([row[length * j:length * (j + 1)] for row in m[length * i:length * (i + 1)]])


n = int(input())
matrix = [list(map(int, input().split())) for _ in range(n)]
cut_paper(matrix)
print(num_paper[0], num_paper[1], num_paper[2], sep='\n')
