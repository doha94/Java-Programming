/*
정수를 10개 저장하는 배열을 만들고, 11~19범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 들어 있는 정수들과 평균을 출력하라.
랜덤한 정수들... 16 13 17 19 12 16 14 17 16 11
평균은 15.1
*/

package Quection0307;

import java.util.Random; // 랜덤 숫자 생성을 위한 Random 클래스 임포트

public class RandomArray { // RandomArray 클래스 정의
    public static void main(String[] args) { // 프로그램의 시작점 main 메서드
        int[] numbers = new int[10]; // 정수를 10개 저장할 배열 생성
        Random random = new Random(); // 랜덤 숫자를 생성하기 위한 Random 객체 생성
        int sum = 0; // 정수의 합계를 저장할 변수 초기화

        System.out.print("랜덤한 정수들... "); // 랜덤한 정수 출력 메시지

        // 배열에 11~19 범위의 랜덤한 정수 저장
        for (int i = 0; i < numbers.length; i++) { // 배열의 길이만큼 반복
            numbers[i] = random.nextInt(9) + 11; // 0~8 범위의 정수에 11을 더해 11~19 범위 생성
            System.out.print(numbers[i] + " "); // 생성된 정수를 출력
            sum += numbers[i]; // 정수를 sum 에 더해 합계 계산
        }

        System.out.println(); // 줄바꿈

        // 평균 계산 및 출력
        double average = (double) sum / numbers.length; // 총합을 배열의 길이로 나눠 평균 계산
        System.out.printf("평균은 %.1f\n", average); // 평균을 소수점 첫째 자리까지 출력
    }
}