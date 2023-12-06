import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a_age, b_age;
        String c, d;
        
        // 입력
        a_age = sc.nextInt();
        
        c = sc.next();

        b_age = sc.nextInt();
        d = sc.next();

        // 출력
        if((a_age >= 19 && c.equals("M")) || (b_age >= 19 && d.equals("M")))
            System.out.println(1);
        else
            System.out.println(0);
    }
}