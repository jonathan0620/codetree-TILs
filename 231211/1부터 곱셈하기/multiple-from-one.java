import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int prod = 1; 
        int num = 0;
        for (int i = 1; i <= a; i++) {
            prod *= i;
            num = i;
            if (prod >= a) {
                break;
            }
        }
        System.out.println(num);
    }
}