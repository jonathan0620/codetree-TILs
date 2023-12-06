import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 0; int answer1 = 0;
        if (a < b ) {
            answer = 1;
        }
        else {
            answer = 0;
        }

        if (a == b) {
            answer1 = 1;
        }
        else {
            answer1 = 0;
        }
        System.out.print(answer + " " + answer1);
    }
}