/*
문제 8번

몇 개의 정수를 저장할 것인지 개수를 입력받고, 그 만큼의 배열을 생성하라. 그 배열에 1~100범위의 랜덤한 정수를 저장한 후, 정수들과 평균을 출력하라. 단, 정수가 저장되지 않게 하라.
정수 몇 개 저장하시겠습니까>>12
랜덤한 정수들... 67 69 31 48 27 20 92 55 50 47 93 75
평균은 56.1666666666666664
*/

package Quection0812;

import java.util.Random; // 랜덤 숫자 생성을 위한 Random 클래스 임포트
import java.util.Scanner; // 사용자 입력을 위한 Scanner 클래스 임포트

public class UniqueRandomArray { // UniqueRandomArray 클래스 정의
    public static void main(String[] args) { // 프로그램의 시작점 main 메서드
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 처리하기 위한 Scanner 객체 생성
        Random random = new Random(); // 랜덤 숫자를 생성하기 위한 Random 객체 생성

        System.out.print("정수 몇 개 저장하시겠습니까>> "); // 사용자 입력 안내 메시지
        int size = scanner.nextInt(); // 정수의 개수를 입력받아 저장

        int[] numbers = new int[size]; // 입력받은 크기만큼의 배열 생성
        int sum = 0; // 배열 요소의 합계를 저장할 변수 초기화

        // 랜덤한 중복 없는 정수 저장
        for (int i = 0; i < numbers.length; i++) { // 배열의 길이만큼 반복
            int rand; // 랜덤 숫자를 저장할 변수
            boolean isUnique; // 중복 여부를 확인하는 변수

            do {
                rand = random.nextInt(100) + 1; // 1~100 범위의 랜덤 숫자 생성
                isUnique = true; // 초기값으로 중복 아님을 가정
                for (int j = 0; j < i; j++) { // 현재까지 저장된 값들과 비교
                    if (numbers[j] == rand) { // 중복된 값이 있으면
                        isUnique = false; // 중복임을 표시
                        break; // 내부 루프 종료
                    }
                }
            } while (!isUnique); // 중복이 없을 때까지 반복

            numbers[i] = rand; // 중복 없는 숫자를 배열에 저장
            sum += numbers[i]; // 숫자를 합계에 추가
        }

        // 랜덤한 정수들 출력
        System.out.print("랜덤한 정수들... "); // 출력 메시지
        for (int num : numbers) { // 배열의 각 요소를 순회하며
            System.out.print(num + " "); // 숫자를 출력
        }
        System.out.println(); // 줄바꿈

        // 평균 계산 및 출력
        double average = (double) sum / numbers.length; // 총합을 배열의 길이로 나눠 평균 계산
        System.out.println("평균은 " + average); // 평균 출력

        scanner.close(); // Scanner 객체 닫기
    }
}
