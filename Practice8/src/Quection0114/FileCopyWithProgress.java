//7. 파일 복사 및 진행률 표시

package Quection0114;

import java.io.*;

public class FileCopyWithProgress {
    public static void main(String[] args) {
        File source = new File("a.jpg"); // 원본 파일 경로
        File destination = new File("b.jpg"); // 복사할 파일 경로

        System.out.println(source.getName() + "를 " + destination.getName() + "로 복사합니다.");
        System.out.println("10%마다 *를 출력합니다.");

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            long totalBytes = source.length(); // 파일의 총 크기
            byte[] buffer = new byte[1024]; // 복사할 데이터 버퍼
            int bytesRead;
            long copiedBytes = 0;
            int progress = 0;

            while ((bytesRead = fis.read(buffer)) != -1) { // 파일 끝까지 읽기
                fos.write(buffer, 0, bytesRead); // 데이터를 복사
                copiedBytes += bytesRead;

                int newProgress = (int) ((copiedBytes * 100) / totalBytes); // 진행률 계산
                if (newProgress / 10 > progress / 10) { // 10%마다 진행 표시
                    System.out.print("*");
                    progress = newProgress;
                }
            }

            System.out.println(); // 복사 완료 후 줄 바꿈
        } catch (IOException e) {
            System.out.println("파일 복사 중 오류 발생: " + e.getMessage());
        }
    }
}