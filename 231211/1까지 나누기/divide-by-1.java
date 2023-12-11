import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        
        while (n > 1){
            int divisor = 2;

            while(n % divisor != 0) {
                divisor++;
            }

            n /= divisor;
            cnt++;
        }
        System.out.println(cnt);
    }
}