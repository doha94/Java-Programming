/*
Dictionary 실행창

 */


package Quection1214;

import java.util.Scanner;

public class DicApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");

        while (true) {
            System.out.print("한글 단어? ");
            String word = scanner.next();

            if (word.equals("그만")) { // 종료 조건
                break;
            }

            String result = Dictionary.kor2Eng(word); // 단어 검색
            if (result != null) {
                System.out.println(word + "은(는) " + result);
            } else {
                System.out.println(word + "은(는) 저의 사전에 없습니다.");
            }
        }

        scanner.close(); // 리소스 해제
    }
}
