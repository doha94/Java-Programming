import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplyIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, m = 0;
        
        while (true) {
            try {
                System.out.print("곱하고자 하는 정수 2개 입력>>");
                n = scanner.nextInt(); // 첫 번째 정수 입력
                m = scanner.nextInt(); // 두 번째 정수 입력
                break; // 둘 다 정수일 경우 루프 탈출
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력하세요!");
                scanner.nextLine(); // 잘못된 입력을 처리하고 버퍼를 비움
            }
        }

        System.out.println(n + "x" + m + "=" + (n * m));
        scanner.close();
    }
}
