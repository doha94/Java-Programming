// 1. 이름과 전화번호를 입력받아 파일에 저장

package Quection0114;

import java.io.*;
import java.util.Scanner;

public class SavePhoneNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("C:/temp/phone.txt"); // 저장할 파일 경로 지정

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            System.out.println("전화번호 입력 프로그램입니다.");

            while (true) {
                System.out.print("이름 전화번호 >> ");
                String input = sc.nextLine(); // 사용자 입력 받기

                if (input.equalsIgnoreCase("그만")) { // "그만" 입력 시 종료
                    break;
                }

                writer.write(input); // 입력 내용을 파일에 쓰기
                writer.newLine(); // 줄 바꿈
            }
            System.out.println(file.getPath() + "에 저장하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
        } finally {
            sc.close(); // Scanner 자원 해제
        }
    }
}