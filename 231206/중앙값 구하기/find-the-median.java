import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a<c){
            if(a<b){
                if(c<b){
                    System.out.print(c);
                }else{
                    System.out.print(b);
                }
            }else{
                System.out.print(a);
            }
        }
        else{
            if(b<a){
                if(b<c){
                    System.out.print(c);
                }else{
                    System.out.print(b);
                }
            }else{
                System.out.print(a);
            }
        }
    }
}