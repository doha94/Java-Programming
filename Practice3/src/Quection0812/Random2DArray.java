/*
문제 9번

4*4크기의 2차원 정수 배열을 생성하고, 0~255 범위의 정수 16개를 랜덤하게 생성하여 저장한 후 배열을 실행 사례와 같이 출력하라. 
4X4 배열에 랜덤한 값을 저장한 후 출력합니다.
35	42	120	12
67	57	204	228
19	208	58	203
224	221	23	94
*/

package Quection0812;

import java.util.Random; // 랜덤 숫자 생성을 위한 Random 클래스 임포트

public class Random2DArray { // Random2DArray 클래스 정의
    public static void main(String[] args) { // 프로그램의 시작점 main 메서드
        int[][] array = new int[4][4]; // 4x4 크기의 2차원 배열 생성
        Random random = new Random(); // 랜덤 숫자를 생성하기 위한 Random 객체 생성

        // 배열에 랜덤한 정수를 저장
        for (int i = 0; i < array.length; i++) { // 배열의 행(row)만큼 반복
            for (int j = 0; j < array[i].length; j++) { // 각 행의 열(column)만큼 반복
                array[i][j] = random.nextInt(256); // 0~255 범위의 랜덤 숫자 생성 및 저장
            }
        }

        System.out.println("4X4 배열에 랜덤한 값을 저장한 후 출력합니다."); // 출력 메시지

        // 배열 출력
        for (int i = 0; i < array.length; i++) { // 배열의 행(row)만큼 반복
            for (int j = 0; j < array[i].length; j++) { // 각 행의 열(column)만큼 반복
                System.out.print(array[i][j] + "\t"); // 배열의 요소를 탭으로 구분하여 출력
            }
            System.out.println(); // 각 행 출력 후 줄바꿈
        }
    }
}
 