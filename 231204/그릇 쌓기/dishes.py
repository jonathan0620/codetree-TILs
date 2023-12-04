def calculate_height(arrangement):
    height = 5
    stack = []

    for char in arrangement:
        if char == '(':
            stack.append('(')
        else:
            if stack and stack[-1] == '(':
                stack.pop()
                height += 10
            else:
                stack.append(')')
                height += 5

    return height

# 입력 받기
arrangement = input()

# 높이 계산 및 출력
result = calculate_height(arrangement)
print(result)