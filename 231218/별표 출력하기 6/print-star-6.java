import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 n 입력 받기
        int n = scanner.nextInt();

        // n에 따른 별표 출력
        printStarPattern(n);

        scanner.close();
    }

    // 별표 출력 메서드
    private static void printStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            // 왼쪽 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // 왼쪽 별표 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            // 다음 줄로 이동
            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            // 왼쪽 공백 출력
            for (int j = 1; j < n - i; j++) {
                System.out.print("  ");
            }

            // 왼쪽 별표 출력
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // 다음 줄로 이동
            System.out.println();
        }
    }
}