import java.util.Scanner;

public class StudentScoreSearch {
    public static void main(String[] args) {
        // 10명의 학생 정보를 저장할 배열 선언
        int[] studentIds = new int[10];  // 학번을 저장하는 배열
        int[] studentScores = new int[10];  // 점수를 저장하는 배열

        Scanner sc = new Scanner(System.in);

        // 10명의 학번과 점수를 입력받음
        System.out.println("10명 학생의 학번과 점수 입력");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ">>");
            studentIds[i] = sc.nextInt();  // 학번 입력
            studentScores[i] = sc.nextInt();  // 점수 입력
        }

        // 메뉴 반복 처리
        while (true) {
            System.out.print("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3>>");
            int choice = sc.nextInt();  // 메뉴 선택

            if (choice == 1) {  // 학번으로 검색
                while (true) {
                    try {
                        System.out.print("학번>>");
                        int searchId = sc.nextInt();  // 검색할 학번 입력

                        // 학번을 배열에서 검색
                        boolean found = false;
                        for (int i = 0; i < 10; i++) {
                            if (studentIds[i] == searchId) {
                                System.out.println(studentScores[i] + "점");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println(searchId + "의 학생은 없습니다.");
                        }
                        break;  // 검색 종료 후 메뉴로 돌아감
                    } catch (Exception e) {
                        System.out.println("경고!! 정수를 입력하세요.");
                        sc.nextLine();  // 잘못된 입력 처리 (문자열이 입력되었을 때)
                    }
                }
            } else if (choice == 2) {  // 점수로 검색
                System.out.print("점수>>");
                int searchScore = sc.nextInt();  // 검색할 점수 입력

                // 점수를 배열에서 검색
                boolean found = false;
                System.out.print("점수가 " + searchScore + "인 학생은 ");
                for (int i = 0; i < 10; i++) {
                    if (studentScores[i] == searchScore) {
                        System.out.print(studentIds[i] + " ");
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("없습니다.");
                } else {
                    System.out.println("입니다.");
                }
            } else if (choice == 3) {  // 프로그램 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }

        sc.close();  // Scanner 자원 해제
    }
}
