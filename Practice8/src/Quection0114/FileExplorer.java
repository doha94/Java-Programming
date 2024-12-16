//13, 14번 문제. 간단한 파일 탐색기 및 추가 명령(디렉터리 만들기 및 파일 이름 바꾸기)



package Quection0114;

import java.io.*;
import java.util.*;

public class FileExplorer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File currentDir = new File("C:/"); // 탐색 시작 디렉터리 설정

        while (true) {
            System.out.println("[" + currentDir.getPath() + "]");
            File[] files = currentDir.listFiles(); // 현재 디렉터리의 파일 및 디렉터리 목록 가져오기

            if (files != null) {
                for (File file : files) {
                    String type = file.isDirectory() ? "dir" : "file"; // 파일인지 디렉터리인지 구분
                    System.out.printf("%-4s	%d바이트	%s%n", type, file.length(), file.getName());
                }
            }

            System.out.print(">>");
            String command = sc.nextLine();

            if (command.equalsIgnoreCase("..")) { // 부모 디렉터리로 이동
                currentDir = currentDir.getParentFile();
                if (currentDir == null) {
                    System.out.println("최상위 디렉터리입니다.");
                    currentDir = new File("C:/");
                }
            } else if (command.startsWith("mkdir ")) { // 새 디렉터리 생성
                String dirName = command.substring(6).trim();
                File newDir = new File(currentDir, dirName);
                if (newDir.mkdir()) {
                    System.out.println(dirName + " 디렉터리를 생성하였습니다.");
                } else {
                    System.out.println("디렉터리 생성 실패.");
                }
            } else if (command.startsWith("rename ")) { // 파일 또는 디렉터리 이름 변경
                String[] parts = command.substring(7).trim().split(" ", 2);
                if (parts.length < 2) {
                    System.out.println("두 개의 파일명이 주어지지 않았습니다.!");
                } else {
                    File oldFile = new File(currentDir, parts[0]);
                    File newFile = new File(currentDir, parts[1]);
                    if (oldFile.renameTo(newFile)) {
                        System.out.println(parts[0] + "를 " + parts[1] + "로 이름 변경하였습니다.");
                    } else {
                        System.out.println("이름 변경 실패.");
                    }
                }
            } else {
                File nextDir = new File(currentDir, command);
                if (nextDir.exists() && nextDir.isDirectory()) {
                    currentDir = nextDir; // 서브 디렉터리로 이동
                } else {
                    System.out.println("존재하지 않는 디렉터리입니다.");
                }
                sc.close();
            }
        }
    }
}