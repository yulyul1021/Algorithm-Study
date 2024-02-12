def solution(arr, divisor):
    answer = sorted([arr[i] for i in range(len(arr)) if arr[i] % divisor == 0])
    return [-1] if len(answer) == 0 else answer
