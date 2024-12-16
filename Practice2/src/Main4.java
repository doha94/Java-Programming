import java.util.Scanner;

public class Main4 {

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
        
        // 자리수의 합이 9인 수를 출력
        System.out.print("자리수의 합이 9인 것은... ");
        for (int num : numbers) {
            if (sumOfDigits(num) == 9) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        
        // Scanner 객체 닫기
        scanner.close();
    }
    
    // 자리수의 합을 계산하는 메소드
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;  // num의 마지막 자리수를 sum에 더함
            num /= 10;        // num의 마지막 자리수를 제거
        }
        return sum;
    }
}
