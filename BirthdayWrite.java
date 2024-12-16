/*2장 2번 문제. 사용자가 입력하는 8자리 정수는 생일을 나타낸다. 예를 들어 20010316은 2001년 3월 16일을 뜻한다. Scanner 클래스의 nextInt() 메소드를 이용하여 8자리 정수를 입력받고 년도/월/일을 나누터 출력하라. 8자리 정수가 입력되지 않는 경우는 고려하지 않아도 된다.*/

import java.util.Scanner;

public class BirthdayWrite {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // 정수 입력 요청하기
        System.out.print("8자리 생년월일(예: 20010316)을 입력하세요>>");
        int birthday = scanner.nextInt();

        // 적었던 생년월일 변환하기 
        int year = birthday / 10000; // 년도
        int month = (birthday / 100) % 100; // 월
        int day = birthday % 100; // 일

        // 결과 출력하기
        System.out.printf("%d년 %d월 %d일%n", year, month, day);

        // Scanner 닫기
        scanner.close();
    }
}
