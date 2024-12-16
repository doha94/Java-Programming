/*
5. 실행 사례와 같이 개수가 정해지지 않은 여러 과목의 학점을 빈 칸으로 분리하여 입력받고, A 는 100점, B는 90점, C는 80점, D는 70점, F는 0점으로 계산하여 평균을 출력하는 프로그램을 작성하라. 대소문자는 구분하지 않는다.
*/

package Quction0509;

import java.util.*;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 학점을 문자 등급과 점수로 매핑하기 위한 Map 초기화
        Map<Character, Integer> gradeMap = new HashMap<>();
        gradeMap.put('A', 100);
        gradeMap.put('B', 90);
        gradeMap.put('C', 80);
        gradeMap.put('D', 70);
        gradeMap.put('F', 0);

        while (true) {
            System.out.print("여러 과목의 학점을 빈 칸으로 분리 입력>> ");
            String input = sc.nextLine();

            // "그만" 입력 시 프로그램 종료
            if (input.equalsIgnoreCase("그만")) {
                break;
            }

            // 입력된 학점들을 배열로 분리
            String[] grades = input.split(" ");
            double total = 0;
            boolean validInput = true;

            for (String grade : grades) {
                char letter = Character.toUpperCase(grade.charAt(0)); // 학점 대문자로 변환
                if (gradeMap.containsKey(letter)) {
                    total += gradeMap.get(letter); // 학점에 해당하는 점수 합산
                } else {
                    System.out.println("입력 오류: " + grade); // 잘못된 입력 처리
                    validInput = false;
                    break;
                }
            }

            // 평균 계산 및 출력
            if (validInput) {
                double average = total / grades.length;
                System.out.println("평균은 " + average);
            }
        }
        sc.close(); // Scanner 리소스 해제
    }
}