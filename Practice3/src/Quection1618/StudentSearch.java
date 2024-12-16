/*

18번 문제

1차원 정수 배열을 2개 생성하고 10명 학생의 학번과 점수를 입력받아 각각 저장하라. 그리고 다음과 같이 학번을 입력하면 점수를 출력하라.
10명의 학생의 학번과 점수 입력
*/

package Quection1618;

import java.util.Scanner;

public class StudentSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentIds = new int[10];
        int[] scores = new int[10];

        // 학번과 점수 입력
        System.out.println("10명의 학생의 학번과 점수 입력");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ">> ");
            studentIds[i] = scanner.nextInt();
            scores[i] = scanner.nextInt();
        }

        while (true) {
            System.out.print("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3>> ");
            int option = 0;
            try {
                option = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("경고!! 정수를 입력하세요.");
                scanner.nextLine(); // 버퍼 정리
                continue;
            }

            if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (option) {
                case 1: // 학번으로 검색
                    System.out.print("학번>> ");
                    try {
                        int searchId = scanner.nextInt();
                        boolean found = false;
                        for (int i = 0; i < 10; i++) {
                            if (studentIds[i] == searchId) {
                                System.out.println(scores[i] + "점");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println(searchId + "의 학생은 없습니다.");
                        }
                    } catch (Exception e) {
                        System.out.println("경고!! 정수를 입력하세요.");
                        scanner.nextLine(); // 버퍼 정리
                    }
                    break;

                case 2: // 점수로 검색
                    System.out.print("점수>> ");
                    try {
                        int searchScore = scanner.nextInt();
                        boolean found = false;
                        System.out.print("점수가 " + searchScore + "인 학생은 ");
                        for (int i = 0; i < 10; i++) {
                            if (scores[i] == searchScore) {
                                System.out.print(studentIds[i] + " ");
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("없습니다.");
                        } else {
                            System.out.println("입니다.");
                        }
                    } catch (Exception e) {
                        System.out.println("경고!! 정수를 입력하세요.");
                        scanner.nextLine(); // 버퍼 정리
                    }
                    break;

                default:
                    System.out.println("올바른 옵션을 선택하세요.");
                    break;
            }
        }

        scanner.close(); // 자원 해제
    }
}
