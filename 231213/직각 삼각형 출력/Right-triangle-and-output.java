import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
         
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // 줄 바꿈을 추가하여 다음 줄로 이동합니다.
            System.out.println();
        }

    }
}