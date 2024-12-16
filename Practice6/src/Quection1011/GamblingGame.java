/*
11번 문제
*/
package Quection1011;

import java.util.*;

class Player {
    private String name; // 플레이어 이름

    public Player(String name) {
        this.name = name; // 이름 초기화
    }

    public String getName() {
        return name; // 이름 반환
    }
}

class GamblingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체

        System.out.print("겜블링 게임에 참여할 선수 숫자>>>");
        int playerCount = scanner.nextInt(); // 선수 수 입력받음
        scanner.nextLine(); // 남은 개행 문자 제거

        Player[] players = new Player[playerCount]; // 선수 배열 생성

        for (int i = 0; i < playerCount; i++) {
            System.out.print((i + 1) + "번째 선수 이름>>");
            String name = scanner.nextLine(); // 선수 이름 입력
            players[i] = new Player(name); // Player 객체 생성 및 배열에 저장
        }

        Random random = new Random(); // 랜덤 값 생성을 위한 Random 객체

        while (true) {
            for (Player player : players) { // 각 선수마다 차례대로 실행
                System.out.print("[" + player.getName() + "]:<Enter>");
                scanner.nextLine(); // Enter 키 대기

                int num1 = random.nextInt(3) + 1; // 첫 번째 랜덤 숫자 생성
                int num2 = random.nextInt(3) + 1; // 두 번째 랜덤 숫자 생성
                int num3 = random.nextInt(3) + 1; // 세 번째 랜덤 숫자 생성

                System.out.println(num1 + "\t" + num2 + "\t" + num3); // 랜덤 숫자 출력

                if (num1 == num2 && num2 == num3) { // 숫자가 모두 일치하는지 확인
                    System.out.println(player.getName() + "님이 이겼습니다!");
                    scanner.close(); // Scanner 자원 해제
                    return; // 게임 종료
                } else {
                    System.out.println("아쉽군요!");
                }
            }
        }
    }
}