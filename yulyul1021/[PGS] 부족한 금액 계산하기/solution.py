def solution(price, money, count):
    res = (count * (2 * price + (count - 1) * price)) // 2
    return 0 if money >= res else res - money
# 등차수열의 합
