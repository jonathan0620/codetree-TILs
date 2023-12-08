import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 0; i < a; i++){
            int number = sc.nextInt();
            if(number % 2 == 1 && number % 3 == 0){
                System.out.println(number);
            }
        }
    }
}