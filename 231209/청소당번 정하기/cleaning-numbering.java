import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int toi = 0;
        int bok = 0;
        int cla = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                cla++;
                if(i%6==0){
                    cla--;
                }
            }
            if(i % 3 == 0){
                bok++;
                if(i % 12 == 0){
                    bok--;
                }
            }
            if(i % 12 == 0){
                toi++;
            }
        }

        System.out.printf("%d %d %d", cla, bok, toi);
    }
}