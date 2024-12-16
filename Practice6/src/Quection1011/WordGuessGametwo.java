/*
10번 문제 2번 예시
 */




package Quection1011;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordGuessGametwo {
    public static void main(String[] args) {
        String[] words = {"happy", "morning", "poackae", "together", "lovely", "sunny", "extract", "nation", "cookie", "connect"};
        
        Scanner scanner = new Scanner(System.in);
        
        // 랜덤으로 단어 선택
        String word = words[(int)(Math.random() * words.length)];
        
        // 단어의 글자들 섞기
        List<Character> shuffledWordList = new ArrayList<>();
        for (char c : word.toCharArray()) {
            shuffledWordList.add(c);
        }
        Collections.shuffle(shuffledWordList);
        
        // 섞인 단어 출력
        StringBuilder shuffledWord = new StringBuilder();
        for (char c : shuffledWordList) {
            shuffledWord.append(c);
        }
        
        // 게임 시작 알림
        System.out.println("10초 안에 단어 맞추세요!!");
        System.out.println(shuffledWord.toString()); // 섞인 단어 출력
        
        // 시간 측정 시작
        long startTime = System.currentTimeMillis();
        
        // 사용자 입력 받기
        String userInput = scanner.nextLine();
        
        // 시간 측정 종료
        long endTime = System.currentTimeMillis();
        
        // 경과 시간 계산
        double elapsedTime = (endTime - startTime) / 1000.0; // 초 단위로 변환
        
        // 10초 내에 맞췄는지 확인
        if (elapsedTime > 10) {
            System.out.println("실패!! 10초 초과. " + elapsedTime + "초 경과");
        } else if (userInput.equals(word)) {
            System.out.println("성공!! " + elapsedTime + "초 경과");
        } else {
            System.out.println("실패!! " + word + "입니다. " + elapsedTime + "초 경과");
        }
        
        scanner.close();
    }
}
