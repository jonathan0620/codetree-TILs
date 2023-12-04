import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrangement = scanner.nextLine();
        int result = calculateHeight(arrangement);
        System.out.println(result);
    }

    static int calculateHeight(String arrangement) {
        int height = 5;
        Stack<Character> stack = new Stack<>();

        for (char ch : arrangement.toCharArray()) {
            if (ch == '(') {
                stack.push('(');
                height += 10;
            } else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(')');
                    height += 5;
                }
            }
        }

        return height;
    }
}