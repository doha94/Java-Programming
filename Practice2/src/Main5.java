import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        // Scanner 객체 생성 (사용자로부터 입력받기 위함)
        Scanner scanner = new Scanner(System.in);
        
        // 양의 정수 10개를 저장할 배열 생성
        int[] numbers = new int[10];
        
        // 사용자로부터 10개의 정수를 입력받아 배열에 저장
        System.out.print("양의 정수 10개 입력>> ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // 3의 배수만 출력
        System.out.print("3의 배수는... ");
        for (int num : numbers) {
            if (num % 3 == 0) {  // num이 3의 배수인지 확인
                System.out.print(num + " ");
            }
        }
        System.out.println();
        
        // Scanner 객체 닫기
        scanner.close();
    }
}
