def cantorian_set(num):
    if num == 0:
        return '-'
    else:
        return (cantorian_set(num-1)
                + ' ' * len(cantorian_set(num-1))
                + cantorian_set(num-1))

while True:
    try:
        n = int(input())
        print(cantorian_set(n))
    except:
        break
