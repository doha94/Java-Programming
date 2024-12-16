/*
16번 문제

양수들을 한 줄에 입력받고 평균을 구하는 프로그매을 작성하라. 입력에서 양의 정수가 아닌 것들은 모두 빼고 평균을 구하라. 다음은 실행 사례이다.
양의 정수를 입력하세요. <-1은 입력 끝>>10 hello 20 3.14 30 -2 40 -1
hello 제외
3.14제외
-2제외
평균은 25
 */


package Quection1618;

import java.util.ArrayList;
import java.util.Scanner;

public class PositiveIntegerAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("양의 정수를 입력하세요. <-1은 입력 끝>> ");

        while (true) {
            String input = scanner.next(); // 공백 단위로 입력받기

            // 입력이 숫자인지 확인하고, -1이면 종료
            try {
                int num = Integer.parseInt(input);
                if (num == -1) {
                    break; // -1 입력 시 입력 종료
                }
                if (num > 0) {
                    numbers.add(num); // 양수만 리스트에 추가
                } else {
                    System.out.println(input + " 제외"); // 음수 제외 메시지 출력
                }
            } catch (NumberFormatException e) {
                System.out.println(input + " 제외"); // 숫자가 아닌 입력 제외 메시지 출력
            }
        }

        // 평균 계산 및 출력
        if (numbers.isEmpty()) {
            System.out.println("양의 정수가 없습니다.");
        } else {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            double average = (double) sum / numbers.size();
            System.out.println("평균은 " + (int) average); // 정수로 출력
        }

        scanner.close(); // Scanner 자원 해제
    }
}
