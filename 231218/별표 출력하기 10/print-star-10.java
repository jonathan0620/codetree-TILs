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
        for (int i = 0; i < 2 * n - 1; i++) {
            // i가 홀수인 경우
            if (i % 2 != 0) {
                int starCount = n - (i - 1) / 2;
                for (int j = 0; j < starCount; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        // 아래쪽 부분 출력
        for (int i = 0; i < 2 * n - 1; i++) {
            // i가 짝수인 경우
            if (i % 2 == 0) {
                int starCount = 1 + (i / 2);
                for (int j = 0; j < starCount; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}