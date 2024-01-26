# 논문 n편 증, a번 이상 인용된 논문이 b편 이상이면 a 와 b중 작은 값이 hIndex 값
def solution(citations):
    hidx = 0
    citations.sort(reverse=True)
    for idx, citation in enumerate(citations, start=1):
        hidx = max(hidx, min(idx, citation))
    return hidx
