import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 n을 입력 받습니다.
        int n = scanner.nextInt();

        // 1부터 n까지 반복하면서 각 줄에 해당하는 별을 출력합니다.
        for (int i = 1; i <= n; i++) {
            // 각 줄에는 (2 * i - 1)개의 별이 출력됩니다.
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // 줄 바꿈을 추가하여 다음 줄로 이동합니다.
            System.out.println();
        }

    }
}