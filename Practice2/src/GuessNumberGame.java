/*
숨겨진 카드의 수를 맞추는 게임을 만들어보자. 0에서 99가지의 임의의 수를 가진 카드를 한 장 숨기고 이 카드의 수를 맞추는 게임이다. 아래의 화면과 같이 카드 속의 수가 77인 경우를 보자.
수를 맞추는 사람이 55라고 입력하면 "더 높게". 다시 70 을 입력하면 "더 높게 " 라는 식으로 범위를 좁혀가면서 수를 맞춘다.
게임을 반복하기 위해 y/n 을 묻고, n 인 경우 종료된다.
*/

import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 사용자 입력을 받기 위한 Scanner 객체 생성
        Random rand = new Random();  // 임의의 수를 생성하기 위한 Random 객체 생성
        String playAgain;  // 게임을 다시 할지 여부를 저장하는 변수

        do {
            // 임의의 수 생성 (0에서 99까지)
            int hiddenNumber = rand.nextInt(100);
            int lowerBound = 0;  // 범위의 하한
            int upperBound = 99;  // 범위의 상한
            int attempts = 0;  // 시도 횟수

            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            System.out.println(lowerBound + "-" + upperBound);  // 현재 범위 출력

            // 사용자가 맞출 때까지 반복
            while (true) {
                attempts++;  // 시도 횟수 증가
                System.out.print(attempts + ">>");
                int guess = sc.nextInt();  // 사용자 입력 받기

                // 사용자가 추측한 수가 숨겨진 수보다 낮으면 "더 높게"
                if (guess < hiddenNumber) {
                    System.out.println("더 높게");
                    lowerBound = guess + 1;  // 하한을 사용자가 추측한 수 + 1로 조정
                }
                // 사용자가 추측한 수가 숨겨진 수보다 높으면 "더 낮게"
                else if (guess > hiddenNumber) {
                    System.out.println("더 낮게");
                    upperBound = guess - 1;  // 상한을 사용자가 추측한 수 - 1로 조정
                }
                // 정답을 맞췄으면 종료
                else {
                    System.out.println("맞았습니다.");
                    break;
                }

                // 현재의 추측 가능한 범위 출력
                System.out.println(lowerBound + "-" + upperBound);
            }

            // 게임을 다시 할 것인지 물어봄
            System.out.print("다시 하시겠습니까(Y/N)>>");
            playAgain = sc.next();  // 사용자로부터 다시 할지 여부를 입력받음

        } while (playAgain.equalsIgnoreCase("y"));  // "y" 또는 "Y"를 입력하면 다시 시작

        System.out.println("종료");
        sc.close();  // Scanner 객체 닫기
    }
}
