/*
한 달의 다이어리를 관리하는 프로그램을 작성하라. 한 달은 30일로 정한다. 이 프로그램은 사용자로부터 날짜와 기억할 일을 가단히 저장하거나, 검색하는 등의 기능을 수행하며, 실행 예시는 다음과 같다. 기억할 일은 빈칸 없이 4글자 이하의 문자열만 다룬다.
*/

package Quection1011;

import java.util.Scanner;

public class Diary {
    private String[] diaryEntries;  // 각 날짜의 기억할 일을 저장할 배열 (30일)

    // 생성자: 30일의 배열을 초기화
    public Diary() {
        diaryEntries = new String[30];  // 1일부터 30일까지 기록
    }

    // 날짜와 텍스트를 입력받아 기록하는 메소드
    public void record(int day, String text) {
        if (day < 1 || day > 30) {
            System.out.println("날짜는 1~30 사이로 입력해주세요.");
            return;
        }
        if (text.length() > 4 || text.contains(" ")) {
            System.out.println("기억할 일은 빈칸 없이 4글자 이하만 가능합니다.");
            return;
        }
        diaryEntries[day - 1] = text;  // 배열은 0부터 시작하므로 day-1에 저장
    }

    // 저장된 내용을 출력하는 메소드
    public void view() {
        System.out.println("***** 2024년 10월 다이어리 *****");
        for (int i = 0; i < 30; i++) {
            if (diaryEntries[i] != null) {
                System.out.println((i + 1) + "일: " + diaryEntries[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Diary diary = new Diary();
        boolean running = true;

        System.out.println("***** 2024년 10월 다이어리 *****");

        while (running) {
            System.out.print("기록:1, 보기:2, 종료:3>>");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("날짜(1~30)와 텍스트*빈칸없이 4글자 이하)>>");
                    int day = scanner.nextInt();
                    String text = scanner.next();  // 공백 없이 입력된 텍스트만 받음
                    diary.record(day, text);
                    break;

                case 2:
                    diary.view();
                    break;

                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        }
        scanner.close();
    }
}
