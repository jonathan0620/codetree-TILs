import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 n 입력 받기
        int n = scanner.nextInt();

        // n에 따른 별표 출력
        printStarTriangle(n);

        scanner.close();
    }

    // 별표 출력 메서드
    private static void printStarTriangle(int n) {
        for (int i = 0; i < n; i++) {
            // 왼쪽 별표 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // 공백 출력
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // 오른쪽 별표 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // 다음 줄로 이동
            System.out.println();
        }
    }
}