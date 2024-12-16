/*
숨겨진 숫자에 가장 가까운 수를 제시하는 사람이 이기는 예측 게임을 작성해보자. 
1~100범위의 정수를 랜덤하게 1개 생성하고, 게임에 참여한 선수들에게 수를 맞추게 한 후 숨겨진 답에 가장 가까운 선수가 승리하며 1점을 부여한다. 
게임이 여러 번 반복되며 쌓인 점수가 많은 사람이 최종 승자가 된다. 게임에 참여하는 사람을 Player 클래스로 만들고 이곳에 선수 이름과 누적 점수를 저장한다. 
main()을 포함하는 게임 프로그램의 클래스는 GuessGame으로 함

*/

package Quection0709;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        score++;
    }
}

public class GuessGame {
    private ArrayList<Player> players;
    private Random random;
    private Scanner scanner;

    public GuessGame() {
        players = new ArrayList<>();
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void addPlayer(String name) {
        players.add(new Player(name));
    }

    public void play() {
        while (true) {
            System.out.println("1~100 사이의 숫자가 결정되었습니다. 선수들은 맞추어 보세요.");
            int hiddenNumber = random.nextInt(100) + 1;
            int closestPlayerIndex = -1;
            int closestDifference = Integer.MAX_VALUE;

            for (int i = 0; i < players.size(); i++) {
                Player player = players.get(i);
                System.out.print(player.getName() + ">>");
                int guess = scanner.nextInt();

                int difference = Math.abs(hiddenNumber - guess);
                if (difference < closestDifference) {
                    closestDifference = difference;
                    closestPlayerIndex = i;
                }
            }

            Player winner = players.get(closestPlayerIndex);
            System.out.println("정답은 " + hiddenNumber + ". " + winner.getName() + "이 이겼습니다. 승점 1점 확보!");
            winner.addScore();

            System.out.print("계속하시려면 yes 입력>>");
            String input = scanner.next();
            if (!input.equalsIgnoreCase("yes")) {
                break;
            }
        }

        showFinalResults();
    }

    private void showFinalResults() {
        System.out.println("최종 점수:");
        Player highestScorer = players.get(0);
        for (Player player : players) {
            System.out.println(player.getName() + ": " + player.getScore());
            if (player.getScore() > highestScorer.getScore()) {
                highestScorer = player;
            }
        }
        System.out.println(highestScorer.getName() + "이 최종 승리하였습니다.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessGame game = new GuessGame();

        System.out.println("*** 예측 게임을 시작합니다. ***");
        System.out.print("게임에 참여할 선수 수 >>");
        int numberOfPlayers = scanner.nextInt();

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("선수 이름>>");
            String name = scanner.next();
            game.addPlayer(name);
        }

        game.play();
        scanner.close();
    }
}
