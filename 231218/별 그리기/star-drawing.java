import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 n 입력 받기
        int n = scanner.nextInt();

        // 다이아몬드 출력
        printDiamondPattern(n);
    }

    // 다이아몬드 출력 메서드
    private static void printDiamondPattern(int n) {
        // 위쪽 부분 출력
        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 별표 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // 줄 바꿈
            System.out.println();
        }

        // 아래쪽 부분 출력
        for (int i = n - 1; i >= 1; i--) {
            // 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 별표 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // 줄 바꿈
            System.out.println();
        }
    }
}