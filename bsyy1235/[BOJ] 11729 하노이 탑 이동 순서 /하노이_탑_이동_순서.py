def Hanoi(n,before,tmp,after):
    if(n==1):
        print(before,after)

    else:
        Hanoi(n-1,before,after,tmp)
        print(before,after)
        Hanoi(n-1,tmp,before,after)

num = int(input())
print(2**num-1)
Hanoi(num,1,2,3)
