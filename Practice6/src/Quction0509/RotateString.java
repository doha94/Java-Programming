/*
6. 문자열을 입력받아 실행 예시와 같이 한 글자씩 회전시키는 프로그램을 작성하라.
문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.
*/


package Quction0509;

import java.util.*;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.\n> ");
        String input = sc.nextLine();

        // 문자열의 각 문자를 회전하여 출력
        for (int i = 0; i < input.length(); i++) {
            String rotated = input.substring(i) + input.substring(0, i); // 문자열 회전
            System.out.println(rotated); // 회전된 문자열 출력
        }

        sc.close(); // Scanner 리소스 해제
    }
}