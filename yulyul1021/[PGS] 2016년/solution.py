def solution(a, b):
    DAY = ['THU','FRI','SAT', 'SUN','MON','TUE','WED']
    MONTH = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    return DAY[((sum(MONTH[:a]) + b)) % 7]
