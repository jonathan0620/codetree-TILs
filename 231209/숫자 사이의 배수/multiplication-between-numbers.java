import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int sumVal = 0;
        int cnt = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0){
                sumVal += i;
                cnt++;
            }
        }
        double average = (double) sumVal / cnt;
        System.out.printf("%d %.1f", sumVal, average);
    }
}