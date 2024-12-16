/*
12번 문제
사용자로부터 "남" 혹은 "여"를 입력받아, 남자 또는 여자의 이름을 작명하는 프로그램을 작성하라. 다음 실행 예시와 같이 "그만" 을 입력하면 프로그램은 종료한다.

*****작명 프로그램이 실행됩니다.*****
남/여 선택>>여
성 입력>>하
추천 이름: 하여린
남/여 선택>>여
성 입력>>김
추천 이름: 김하진
남/여 선택>>남
성 입력>>홍
추천 이름:홍민우
남/여 선택>>야야야
남/여/그만 중에서 입력하세요!
남/여 선택>>그만

*/


package Quection0812;

import java.util.Random;
import java.util.Scanner;

public class NameGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // 여자와 남자의 이름 리스트
        String[] femaleNames = {"예린", "하진", "수민", "지아", "다현"};
        String[] maleNames = {"민우", "준호", "성민", "지훈", "태양"};

        System.out.println("***** 작명 프로그램이 실행됩니다. *****");

        while (true) {
            System.out.print("남/여 선택>> ");
            String gender = scanner.nextLine().trim(); // 사용자 입력 받기 (공백 제거)

            if (gender.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (!gender.equals("남") && !gender.equals("여")) {
                System.out.println("남/여/그만 중에서 입력하세요!");
                continue; // 잘못된 입력 시 다시 입력 받기
            }

            System.out.print("성 입력>> ");
            String surname = scanner.nextLine().trim(); // 성 입력 받기

            // 랜덤으로 이름 생성
            String fullName;
            if (gender.equals("여")) {
                fullName = surname + femaleNames[rand.nextInt(femaleNames.length)];
            } else {
                fullName = surname + maleNames[rand.nextInt(maleNames.length)];
            }

            // 추천 이름 출력
            System.out.println("추천 이름: " + fullName);
        }

        scanner.close(); // Scanner 자원 해제
    }
}
