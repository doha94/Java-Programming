package Quection12;

import java.util.*;

public class NumberExpectationGame {
    private List<Player> players;  // 참가 선수들 리스트

    public NumberExpectationGame() {
        players = new ArrayList<>();
    }

    // 선수들 이름과 선택한 숫자를 입력받는 함수
    public void startGame() {
        Scanner scanner = new Scanner(System.in);  // Scanner 객체 생성

        try {
            // 선수들의 이름 입력
            System.out.print("게임에 참여할 선수들 입름>>");
            String input = scanner.nextLine();
            String[] playerNames = input.split(" ");  // 이름을 공백 기준으로 분리

            // 각 선수의 선택한 숫자 입력
            for (String playerName : playerNames) {
                System.out.print("[" + playerName + "] 정수 선택(1~10)>>");
                int chosenNumber = scanner.nextInt();
                scanner.nextLine();  // 숫자 입력 후 남은 엔터를 처리하기 위해 nextLine() 호출
                players.add(new Player(playerName, chosenNumber));
            }

            // 게임 반복
            while (players.size() > 1) {
                // 15개의 랜덤 숫자 생성
                List<Integer> randomNumbers = generateRandomNumbers();
                System.out.println("랜덤 숫자: " + randomNumbers);  // 랜덤 숫자 출력
                System.out.println("Enter키 입력>>");
                scanner.nextLine();  // Enter키를 기다림 (사용자 입력을 받기 위해)

                // 각 선수들이 맞춘 숫자 개수를 계산
                Map<Player, Integer> matchCounts = new HashMap<>();
                for (Player player : players) {
                    int matches = player.countMatches(randomNumbers);
                    matchCounts.put(player, matches);
                    System.out.println("[" + player.getName() + "] 맞춘 개수: " + matches);
                }

                // 맞춘 개수가 가장 적은 선수들 찾기
                int minMatches = Integer.MAX_VALUE;
                for (int matches : matchCounts.values()) {
                    minMatches = Math.min(minMatches, matches);
                }

                // 패자 찾기
                List<Player> losers = new ArrayList<>();
                for (Map.Entry<Player, Integer> entry : matchCounts.entrySet()) {
                    if (entry.getValue() == minMatches) {
                        losers.add(entry.getKey());
                    }
                }

                // 패자들 출력
                System.out.print("현재 패자들 : ");
                for (Player loser : losers) {
                    System.out.print(loser.getName() + " ");
                }
                System.out.println();

                // 패자들만 남겨서 다시 게임 진행
                players = losers;
            }

            // 최종 패자 출력
            System.out.println("최종 패자는 " + players.get(0).getName() + "입니다.");
        } finally {
            scanner.close();  // 자원 해제
        }
    }

    // 15개의 랜덤 숫자 생성
    private List<Integer> generateRandomNumbers() {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            randomNumbers.add(random.nextInt(10) + 1);  // 1~10 사이의 숫자
        }
        return randomNumbers;
    }

    public static void main(String[] args) {
        // 게임 시작
        NumberExpectationGame game = new NumberExpectationGame();
        game.startGame();
    }
}

