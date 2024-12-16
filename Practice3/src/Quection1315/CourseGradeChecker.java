/*
13번 문제

과목과 학점이 들어 있는 다음 2개의 배열을 활용하여, 과목명을 입력받아 학점을 입력하는 프로그램을 작성하라. "그만"이 입력되면 프로그램을 종료한다.
String course [] = {"C", "C++", "Python", "Java", "HTML5" };
String grade [] = {"A", "B+", "B", "A+", "D"};

과목>>Java
Java 학점은 A+
과목>>C+
C+는 없는 과목입니다.
과목>>C++
C++학점은 B+
과목>>그만*/

package Quection1315;

import java.util.Scanner;

public class CourseGradeChecker {

    public static void main(String[] args) {
        // 과목명과 학점을 저장한 배열
        String[] course = {"C", "C++", "Python", "Java", "HTML5"};
        String[] grade = {"A", "B+", "B", "A+", "D"};

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("과목>> ");
            String input = scanner.nextLine().trim(); // 사용자 입력 받기 (공백 제거)

            if (input.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 입력한 과목이 배열에 있는지 확인
            boolean found = false; // 과목 존재 여부를 나타내는 변수
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(input)) {
                    System.out.println(input + " 학점은 " + grade[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(input + "는 없는 과목입니다.");
            }
        }

        scanner.close(); // Scanner 자원 해제
    }
}

