exp = input()

expressions = exp.split('-')

res = sum(map(int, expressions[0].split('+')))
for expression in expressions[1:]:
    res -= sum(map(int, expression.split('+')))

print(res)
