import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 3;                  

        while (i <= a) {           
            System.out.print(i+" ");  
            i += 3;                                
        }

    }
}