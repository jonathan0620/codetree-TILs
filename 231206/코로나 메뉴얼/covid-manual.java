import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, c, e;
        int b, d, f;
        int count = 0;
        a = sc.next();
        b = sc.nextInt();
        c = sc.next();
        d = sc.nextInt();
        e = sc.next();
        f = sc.nextInt();

        if(a.equals("Y") && b >= 37){
            count += 1;
        }else{
            count += 0;
        }

        if(c.equals("Y") && d >= 37){
            count += 1;
        }else{
            count += 0;
        }

        if(e.equals("Y") && f >= 37){
            count += 1;
        }else{
            count += 0;
        }

        if(count >= 2){
            System.out.print("E");
        } else {
            System.out.print("N");
        }

    }
}