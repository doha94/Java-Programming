/*
양의 정수 10개를 입력받아 일차원 배열에 저장하라. 그리고 일차원 배열에서 각 수를 분석하여 자리수의 합이 9인 것을 가려내어 출력하라.예를들어 27은 자리수의 합이 9(2+7)인 것이다.
양의 정수 10개 입력>>9 19 29 33 333 900 342 666 27 100
자리수의 합이 9인 것은 ...9 333 900 342 27
*/

package Quection0307;

import java.util.Scanner; // 사용자 입력을 위한 Scanner 클래스 임포트

public class SumOfDigits { // SumOfDigits 클래스 정의
    public static void main(String[] args) { // 프로그램의 시작점 main 메서드
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 처리하기 위한 Scanner 객체 생성
        int[] numbers = new int[10]; // 양의 정수 10개를 저장할 배열 생성

        // 10개의 정수를 입력받아 배열에 저장
        System.out.print("양의 정수 10개 입력>>"); // 입력 안내 메시지 출력
        for (int i = 0; i < numbers.length; i++) { // 배열의 길이만큼 반복
            numbers[i] = scanner.nextInt(); // 입력받은 정수를 배열에 저장
        }

        System.out.print("자리수의 합이 9인 것은 ..."); // 결과 출력 시작
        for (int num : numbers) { // 배열의 각 요소에 대해 반복
            if (getDigitSum(num) == 9) { // 해당 숫자의 자리수 합이 9인지 확인
                System.out.print(num + " "); // 조건을 만족하는 숫자를 출력
            }
        }

        scanner.close(); // Scanner 객체 닫기
    }

    // 숫자의 자리수 합을 계산하는 메서드
    public static int getDigitSum(int number) { // 정수를 입력받아 자리수의 합을 반환
        int sum = 0; // 자리수의 합을 저장할 변수 초기화
        while (number > 0) { // 숫자가 0보다 클 때까지 반복
            sum += number % 10; // 현재 자리수를 sum 에 더함
            number /= 10; // 숫자를 10으로 나눠 다음 자리로 이동
        }
        return sum; // 최종 계산된 자리수의 합 반환
    }
}
