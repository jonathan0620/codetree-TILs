import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, b, c, d;
        
        // 입력
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        // 출력
        if(a > c)
            System.out.println("A");
        else if (c > a)
            System.out.println("B");
        else if(a == c && b > d)
            System.out.println("A");
        else if (a == c && d > b)
            System.out.println("B");
    }
}