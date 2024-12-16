/*
7. 년도를 입력받아 달력을 출력하는 프로그램을 작성하라. 이때 날짜와 관련된 클래스는 Calendar 클래스만 활용하라.
*/

package Quction0509;

import java.util.*;

public class CalendarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("년도 입력(-1이면 종료)> ");
            int year = sc.nextInt();

            if (year == -1) { // -1 입력 시 프로그램 종료
                break;
            }

            for (int month = 1; month <= 12; month++) {
                printMonth(year, month); // 각 월의 달력 출력
            }
        }
        sc.close(); // Scanner 리소스 해제
    }

    // 특정 년도와 월의 달력을 출력하는 메서드
    private static void printMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1); // 해당 년월의 첫 번째 날짜 설정

        System.out.println(year + "년 " + month + "월");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        int startDay = cal.get(Calendar.DAY_OF_WEEK); // 해당 월의 시작 요일
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 해당 월의 총 일수

        // 시작 요일까지 공백 출력
        for (int i = 1; i < startDay; i++) {
            System.out.print("\t");
        }

        // 날짜 출력
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.print(day + "\t");
            if ((startDay + day - 1) % 7 == 0) { // 한 주가 끝날 때 줄바꿈
                System.out.println();
            }
        }
        System.out.println("\n"); // 마지막 줄 간격
    }
}