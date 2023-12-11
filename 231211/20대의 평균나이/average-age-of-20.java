import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        double sum = 0; double count = 0;
        while (true) {
            a = sc.nextInt();
            if (a < 20 || a >= 30){
                break;
            }
            sum += a;
            count++;
        }
        System.out.printf("%.2f", sum/count);
    }
}