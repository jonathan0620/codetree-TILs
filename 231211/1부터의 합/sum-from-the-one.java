import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0; 
        int num = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
            num = i;
            if (sum >= a) {
                break;
            }
        }
        System.out.println(num);
    }
}