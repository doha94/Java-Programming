/*
14번 문제

겜블링 게임 프로그램 작성해보자. 사용자가 엔터키를 입력하면 0, 1, 2 중에서 랜덤하게 3개의 수를 생성하여 출력하고, 3개가 모두 같은 값일 때 "성공! 대박났어요!"를 출력한다. 실행 예시를 참고하여 프로그램을 작성하라.

엔터키 입력>>
1	1	0
엔터키 입력>>
2	0	1
엔터키 입력>>
1	3	1
엔터키 입력>>
2	2	2
성공! 대박났어요!
계속하시겠습니까?(Yes/No)>>no
게임을 종료합니다.
*/

package Quection1315;

import java.util.Random;
import java.util.Scanner;

public class GamblingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("***** 겜블링 게임을 시작합니다! *****");

        while (true) {
            System.out.print("엔터키 입력>> ");
            scanner.nextLine(); // 엔터키 입력 대기

            // 0, 1, 2 중 랜덤 숫자 3개 생성
            int num1 = rand.nextInt(3);
            int num2 = rand.nextInt(3);
            int num3 = rand.nextInt(3);

            // 생성된 숫자 출력
            System.out.printf("%d\t%d\t%d\n", num1, num2, num3);

            // 세 숫자가 모두 같은 경우 메시지 출력
            if (num1 == num2 && num2 == num3) {
                System.out.println("성공! 대박났어요!");

                // 게임 계속 여부 확인
                System.out.print("계속하시겠습니까?(Yes/No)>> ");
                String response = scanner.nextLine().trim();

                // 대소문자 구분 없이 No 입력 시 종료
                if (response.equalsIgnoreCase("No")) {
                    System.out.println("게임을 종료합니다.");
                    break;
                }
            }
        }

        scanner.close(); // Scanner 자원 해제
    }
}
