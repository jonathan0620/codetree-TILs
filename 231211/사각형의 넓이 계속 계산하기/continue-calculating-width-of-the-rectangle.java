import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        String c;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.next();
            if (c.equals("C")){
                System.out.println(a*b);
                break;
            }else {
                System.out.println(a*b);
            }
        }
    }
}