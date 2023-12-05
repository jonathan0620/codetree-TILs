import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); 
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(s);
        System.out.println(String.format("%.2f",a));
        System.out.println(String.format("%.2f",b));
    }
}