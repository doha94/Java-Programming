//11. words.txt에서 특정 단어로 시작하는 	단어 찾기


package Quection0114;

import java.io.*;
import java.util.*;

public class WordFinder {
    public static void main(String[] args) {
        File file = new File("words.txt"); // 읽을 파일 경로 지정
        Vector<String> words = new Vector<>(); // 단어를 저장할 벡터

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) { // 파일 끝까지 읽기
                words.add(line); // 벡터에 단어 추가
            }
            System.out.println(file.getName() + " 파일을 읽었습니다.");

            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.print("단어>>");
                String prefix = sc.nextLine(); // 사용자 입력 받기

                if (prefix.equalsIgnoreCase("그만")) { // "그만" 입력 시 종료
                    System.out.println("종료합니다.");
                    break;
                }

                boolean found = false;
                for (String word : words) {
                    if (word.startsWith(prefix)) { // 입력된 접두사로 시작하는 단어 찾기
                        System.out.println(word);
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("발견할 수 없음");
                }
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
        }
        
    }
}