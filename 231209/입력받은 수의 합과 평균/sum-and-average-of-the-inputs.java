import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int n;
        int sum = 0;

        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            sum += a;
        }
        double avg = (double) sum / n;
        System.out.printf("%d %.1f", sum, avg);
    }
}