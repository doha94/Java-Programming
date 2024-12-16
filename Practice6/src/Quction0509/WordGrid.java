package Quction0509;

import java.util.*;

public class WordGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        final int SIZE = 5;
        char[][] grid = new char[SIZE][SIZE];

        // 랜덤 문자로 빈칸 채우기
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = (char) ('a' + random.nextInt(26));
            }
        }

        while (true) {
            System.out.print("단어>> ");
            String word = sc.nextLine();

            if (word.equalsIgnoreCase("그만")) { // 종료 조건
                break;
            }

            if (word.length() > SIZE) { // 단어가 배열 크기 초과 시
                System.out.println("단어 길이는 " + SIZE + "글자 이하여야 합니다.");
                continue;
            }

            // 단어 삽입 (2행에 삽입)
            for (int i = 0; i < word.length(); i++) {
                grid[2][i] = word.charAt(i); // 2행에 단어 삽입
            }

            // 그리드 출력
            printGrid(grid);
        }
        sc.close();
    }

    // 그리드 출력 메서드
    private static void printGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
