def calculate_height(arrangement):
    height = 0
    stack = []

    for char in arrangement:
        if char == '(':
            stack.append(char)
        elif char == ')':
            if stack and stack[-1] == '(':
                stack.pop()
                height += 5
            else:
                stack.append(char)
                height += 10

    return height

# 예제 테스트
arrangement1 = "))))"
arrangement2 = "()()(()())("

result1 = calculate_height(arrangement1)
result2 = calculate_height(arrangement2)


print(result2)  # 출력: 100