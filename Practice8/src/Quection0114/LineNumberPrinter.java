//4. 파일에 라인 번호 붙여 출력

package Quection0114;

import java.io.*;

public class LineNumberPrinter {
 public static void main(String[] args) {
     File file = new File("C:/windows/system.ini"); // 읽을 파일 경로 지정

     System.out.println(file.getPath() + " 파일을 읽어 출력합니다.");
     try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
         String line;
         int lineNumber = 1; // 라인 번호 초기화

         while ((line = reader.readLine()) != null) { // 파일 끝까지 읽기
             System.out.println(lineNumber + ": " + line); // 라인 번호와 내용 출력
             lineNumber++;
         }
     } catch (IOException e) {
    	 System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
     	}
 	}
}