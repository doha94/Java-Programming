import java.util.Scanner;

public class StarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // 양의 정수가 입력될 때까지 반복
        do {
            System.out.print("양의 정수를 입력>>");
            number = scanner.nextInt();
        } while (number <= 0);  // 0 이하일 경우 반복

        // 입력된 숫자에 따라 '*' 출력
        for (int i = number; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();  // 줄바꿈
        }

        scanner.close();
    }
}
