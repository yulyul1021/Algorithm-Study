def solution(n,A):
    B = sorted(A)
    p = []
    a=0
    tmp = []

    for i in range(n):
        p.append(-1)

    for i in B:
        if i in tmp:
            continue

        tmp.append(i)
        A_index = list(filter(lambda x:A[x]==i, range(len(A))))

        for j in A_index:
            p[j]=a
            a+=1

    print(*p)

num = int(input())
number = list(map(int,input().split()))
solution(num,number)
