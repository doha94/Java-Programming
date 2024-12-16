/*
10번 문제 (1)번 예시
 */



package Quection1011;

import java.util.Scanner;

public class WordGuessingGame {
    public static void main(String[] args) {
        String[] words = {"happy", "morning", "poackae", "together", "lovely", "sunny", "extract", "nation", "cookie", "connect"};
        
        Scanner scanner = new Scanner(System.in);
        
        // 랜덤으로 단어 선택
        String word = words[(int)(Math.random() * words.length)];
        
        // 게임 시작 알림
        System.out.println("10초 안에 단어 맞추기!");
        System.out.println(word);
        
        // 시간 측정 시작
        long startTime = System.currentTimeMillis();
        
        // 사용자 입력 받기
        String userInput = scanner.nextLine();
        
        // 시간 측정 종료
        long endTime = System.currentTimeMillis();
        
        // 경과 시간 계산
        double elapsedTime = (endTime - startTime) / 1000.0; // 초 단위로 변환
        
        if (userInput.equals(word)) {
            System.out.println("성공!! " + elapsedTime + "초 경과");
        } else {
            System.out.println("실패!! " + word + "입니다.");
        }
        
        scanner.close();
    }
}
