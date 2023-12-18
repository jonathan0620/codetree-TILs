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
        // 상단 부분 출력
        for (int i = 0; i < n; i++) {
            // 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // 별표 출력
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("* ");
            }

            // 줄 바꿈
            System.out.println();
        }

        // 하단 부분 출력
        for (int i = 1; i < n; i++) {
            // 공백 출력
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // 별표 출력
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }

            // 줄 바꿈
            System.out.println();
        }
    }
}