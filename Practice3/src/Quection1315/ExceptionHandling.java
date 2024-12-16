/*
15번 문제

다음 코드는 2개의 정수를 입력받아 곱을 구하는 프로그램이다. 이 프로그램은 실행 중 정수가 아닌 것이 입력되면 라인 3이나 4에서 InputMismatchExeption예외가 발생하고 종료되어 버린다. 이 프로그램을 수정하여 실행 사례와 같이 정수가 입력될 때까지 입력받고 곱을 출력하도록 하라.

1	Scanner scanner = new Scanner(System.in);
2	System.out.print("곱ㅎ고자 하는 정수 2개 입력>>");
3	int n = scanner.nextInt();
4	int m = scanner.nextInt();
5	System.out.println(n + "x" + m + "=" + n*m);
6	scanner.close();

곱하고자 하는 정수 2개 입력>> 5 13.7
정수를 입력하세요!
곱하고자 하는 정수 2개 입력>>hello 365
정수를 입력하세요!
곱하고자 하는 정수 2개 입력>>4 20
4x20=80
*/

package Quection1315;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0, m = 0; // 곱할 두 정수를 저장할 변수

        while (true) {
            try {
                System.out.print("곱하고자 하는 정수 2개 입력>> ");
                n = scanner.nextInt(); // 첫 번째 정수 입력
                m = scanner.nextInt(); // 두 번째 정수 입력
                break; // 정수가 올바르게 입력되면 반복 종료
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력하세요!"); 
                scanner.nextLine(); // 버퍼에 남아 있는 잘못된 입력 제거
            }
        }

        System.out.println(n + "x" + m + "=" + (n * m)); // 곱셈 결과 출력
        scanner.close(); // Scanner 자원 해제
    }
}
