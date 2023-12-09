import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int year = 0; 
        for (int i = 1; i <= a; i++) {
            if (i % 4 == 0 && i % 100 != 0) {
                year++;
                if(i % 100 == 0 && i % 400 == 0){
                    year--;
                }
            }
        }
        System.out.print(year);
    }
}