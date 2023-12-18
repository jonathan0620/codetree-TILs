import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 n 입력 받기
        int n = scanner.nextInt();

        // 별표 출력
        printStarPattern(n);
    }

    // 별표 출력 메서드
    private static void printStarPattern(int n) {
        // 위쪽 부분 출력
        for (int i = 1; i <= n; i++) {
            // 홀수번째 줄에는 '*' 하나만 출력
            if (i % 2 != 0) {
                System.out.println("*");
            } else {
                // 짝수번째 줄에는 '*'을 공백과 함께 출력
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println(); // 줄 바꿈
            }
        }
    }
}