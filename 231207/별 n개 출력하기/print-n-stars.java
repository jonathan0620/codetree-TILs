import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;                  // 시작 값(초기화식)

        while (i <= a) {           // 계속 반복할 조건(조건식)
            System.out.println("*");  // 원하는 코드 작성
            i++;                    // 원하는 증감값 설정(증감식)
        }

    }
}