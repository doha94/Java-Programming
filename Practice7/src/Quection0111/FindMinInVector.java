/*
1번 문제. 벡터를 검색하여 제일 작은 수 찾기
 */



package Quection0111;

import java.util.*; // Scanner 와 Vector 클래스를 사용하기 위한 import

public class FindMinInVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        Vector<Integer> numbers = new Vector<>(); // 정수를 저장할 벡터 생성

        System.out.println("정수 입력(-1이면 입력 끝)>>");

        while (true) {
            int input = scanner.nextInt(); // 정수 입력 받기

            if (input == -1) { // -1 입력 시 반복문 종료
                break;
            }

            if (input > 0) { // 양의 정수만 벡터에 추가
                numbers.add(input);
            }
        }

        if (numbers.isEmpty()) { // 벡터가 비어 있는 경우
            System.out.println("입력된 양의 정수가 없습니다.");
        } else {
            int min = Collections.min(numbers); // 벡터에서 가장 작은 수 찾기
            System.out.println("가장 작은 수는 " + min + "입니다.");
        }

        scanner.close(); // Scanner 리소스 해제
    }
}