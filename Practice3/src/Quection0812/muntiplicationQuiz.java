/*
11번 문제

구구단 퀴즈의 답을 검사하는 프로그램을 작성하라. 랜덤하게 구구단을 붇고 사용자의 답을 입력받아 정답인지 판단한. 3번 틀리면 종료한다.
*****구구단을 맞추는 퀴즈입니다.*****
8x5=40
정답입니다. 잘했습니다.
*/

package Quection0812;

import java.util.Random;
import java.util.Scanner;

public class muntiplicationQuiz {

    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random(); // Random 객체 생성

        int wrongCount = 0; // 틀린 횟수를 저장할 변수

        System.out.println("***** 구구단을 맞추는 퀴즈입니다. *****");

        // 틀린 횟수가 3번 미만일 때 반복
        while (wrongCount < 3) {
            // 1부터 9까지의 랜덤 숫자 생성
            int num1 = rand.nextInt(9) + 1;
            int num2 = rand.nextInt(9) + 1;
            int correctAnswer = num1 * num2; // 정답 계산

            // 문제 출력
            System.out.printf("%d x %d = ", num1, num2);

            // 사용자 입력 받기
            int userAnswer = scanner.nextInt();

            // 정답 여부 판단
            if (userAnswer == correctAnswer) {
                System.out.println("정답입니다. 잘했습니다.");
            } else {
                System.out.println("틀렸습니다. 정답은 " + correctAnswer + "입니다.");
                wrongCount++; // 틀린 횟수 증가
            }
        }

        // 종료 메시지 출력
        System.out.println("3번 틀렸습니다. 프로그램을 종료합니다.");
        
        // Scanner 자원 해제
        scanner.close();
    }
}

