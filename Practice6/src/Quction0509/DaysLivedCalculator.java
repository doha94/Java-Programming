package Quction0509;

import java.util.*; 
import java.time.*; 
import java.time.temporal.ChronoUnit; // ChronoUnit을 사용하기 위한 import 추가

public class DaysLivedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate today = LocalDate.now(); // 현재 날짜 가져오기

        System.out.println("오늘은 " + today + "입니다.");

        while (true) {
            System.out.print("생일 입력(년 월 일)>> ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("그만")) { // "그만" 입력 시 프로그램 종료
                break;
            }

            try {
                // 입력된 생일을 LocalDate로 변환
                String[] parts = input.split(" ");
                int year = Integer.parseInt(parts[0]);
                int month = Integer.parseInt(parts[1]);
                int day = Integer.parseInt(parts[2]);

                LocalDate birthday = LocalDate.of(year, month, day);
                long days = ChronoUnit.DAYS.between(birthday, today); // 총 일수 계산

                if (days < 0) { // 생일이 미래일 경우
                    System.out.println(-days + "일 더 살아야 생일이 됩니다.");
                } else { // 생일이 과거일 경우
                    System.out.println("오늘까지 " + days + "일 살아왔습니다.");
                }
            } catch (Exception e) {
                System.out.println("입력 형식이 잘못되었습니다. 다시 입력해주세요.");
            }
        }
        sc.close(); // Scanner 리소스 해제
    }
}
