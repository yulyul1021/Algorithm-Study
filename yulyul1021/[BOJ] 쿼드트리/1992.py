from sys import stdin

def count_wb(video: list[list]):
    res = [0, 0]
    for pixels in video:
        res[0] += pixels.count(0)
        res[1] += pixels.count(1)
    return res

def compression(video):
    global compression_res
    colors = count_wb(video)
    is_white = True if colors[0] != 0 else False
    is_black = True if colors[1] != 0 else False
    if is_white and is_black:
        # 섞임
        length = len(video) // 2
        print('(', end='')
        for i in range(2):
            for j in range(2):
                compression([pixels[length * j:length * (j + 1)] for pixels in video[length * i:length * (i + 1)]])
        print(')', end='')
    elif is_white:
        print('0', end='')
    else:
        print('1', end='')


n = int(stdin.readline().strip())
video = [list(map(int, stdin.readline().strip())) for _ in range(n)]
compression(video)
