import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0; 
        for (int i = 1; i <= 5; i++) {
            int a = sc.nextInt();
            if (i % 2 == 0) {
                cnt++;
                if(a == 1){
                    cnt =0;
                }
            }
        }
        System.out.print(cnt);
    }
}