import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int sumVal = 0;

        for (int i = 1; i <= 6; i++) {
            a = sc.nextInt();
            if (a % 2 == 1 && a % 3 == 0){
                sumVal += a;
            }
        }
        System.out.println(sumVal);
    }
}