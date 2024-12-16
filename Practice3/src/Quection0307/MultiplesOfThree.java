/*양의 정수 10개를 입력받아 일차원 배열에 저장하라. 그리고 배열에 저장된 정수 중 3의 배수만 출력하는 프로그램을 작성하라.
양의 정수 10개 입력>>6 8 22 78 99 100 54 44 250 2346
3의 배수는...6 78 99 54 2346*/

package Quection0307;

import java.util.Scanner; // 사용자 입력 처리를 위한 Scanner 클래스 임포트

public class MultiplesOfThree { // MultiplesOfThree 클래스 정의
    public static void main(String[] args) { // 프로그램의 시작점인 main 메서드
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        int[] numbers = new int[10]; // 양의 정수 10개를 저장할 1차원 배열 생성

        // 사용자로부터 정수 10개 입력받기
        System.out.print("양의 정수 10개 입력>>"); // 입력 안내 메시지 출력
        for (int i = 0; i < numbers.length; i++) { // 배열의 길이만큼 반복
            numbers[i] = scanner.nextInt(); // 입력받은 정수를 배열에 저장
        }

        // 3의 배수를 출력
        System.out.print("3의 배수는..."); // 출력 메시지
        for (int i = 0; i < numbers.length; i++) { // 배열의 모든 요소를 확인
            if (numbers[i] % 3 == 0) { // 현재 요소가 3의 배수인지 확인
                System.out.print(numbers[i] + " "); // 조건을 만족하면 출력
            }
        }

        scanner.close(); // Scanner 객체 닫기
    }
}
