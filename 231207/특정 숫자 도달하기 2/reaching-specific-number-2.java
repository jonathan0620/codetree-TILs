import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        a = sc.nextInt();
        for (int i = a; i > 0; i--) {
            System.out.print(i+" ");
        }
    }
}