import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0; // 입력된 짝수의 개수를 저장하기 위한 변수

        // 3개 이상의 짝수가 입력될 때까지 반복
        while (count < 3) {
            int number = Integer.parseInt(scanner.nextLine());

            // 주어진 수가 홀수이면 아무 작업도 하지 않음
            if (number % 2 == 1) {
                
            } else {
                // 주어진 수가 짝수이면 2로 나눈 몫을 출력
                System.out.println(number / 2);
                count++; 
            }
        }
    }
}