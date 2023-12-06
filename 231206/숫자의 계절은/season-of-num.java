import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 3 && a <=5) {
            System.out.println("Spring");
        }
        else if (a<=8 && a>=6){
            System.out.println("Summer");
        }
        else if (a<=11 && a>=9){
            System.out.println("Fall");
        }
        else{
            System.out.println("Winter");
        }
    }
}