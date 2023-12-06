import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, b, c, answer, answer1;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        answer=0;
        answer1=0;
        if(a % b == 0 && a % c == 0){
            answer = 1;
        }else{
            answer = 0;
        }
        if(a == b && b == c){
            answer1 = 1;
        }else{
            answer1 = 0;
        }
    System.out.print(answer +" " + answer1);
    }
}