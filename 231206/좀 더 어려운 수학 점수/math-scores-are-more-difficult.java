import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, b;
        
        // 입력
        a = sc.nextInt();
        b = sc.nextInt();

        // 출력
        if(a > b)
            System.out.println("A");
        else if (b>a)
        System.out.println("B");
        else if(a == b && b > a)
            System.out.println("B");
        else if (a == b && a > b)
            System.out.println("A");
    }
}