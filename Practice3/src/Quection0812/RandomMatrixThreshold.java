/*10번 문제

 4x4 크기의 2차원 정수 배열에 0~255범위의 정수 16개를 랜덤하게 생성하여 출력하라. 그리고 실행 사례와 같이 임계값을 입력 받고, 배열에 저장된 정수 임계값보다 크면 255, 작거나 같으면 0으로 배열을수정한 후, 배열을 출력하라. 
4X4 배열에 랜덤한 값을 저장한 후 출력합니다.
239	0	104	166
192	105	129	194
59	110	255	168
97	7	157	65
임계값 입력>>100
255	0	255	255
255	255	255	255
0	255	255	255
0	0	255	0
*/



package Quection0812;

import java.util.Random;
import java.util.Scanner;

public class RandomMatrixThreshold {

    public static void main(String[] args) {
        // 4x4 크기의 2차원 배열 선언
        int[][] matrix = new int[4][4];

        // Random 객체를 생성하여 랜덤한 정수를 생성할 준비
        Random rand = new Random();

        // 2차원 배열을 순회하며 각 요소에 0~255 범위의 랜덤 정수를 할당
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = rand.nextInt(256); // 0부터 255 사이의 정수 생성
            }
        }

        // 초기 배열 출력
        System.out.println("4x4 배열에 랜덤한 값을 저장한 후 출력합니다.");
        printMatrix(matrix);

        // Scanner 객체를 생성하여 사용자 입력을 받음
        Scanner scanner = new Scanner(System.in);
        System.out.print("임계값 입력>> ");
        int threshold = scanner.nextInt(); // 임계값 입력 받기

        // 임계값에 따라 배열을 수정: 값이 임계값보다 크면 255, 작거나 같으면 0으로 설정
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] > threshold) {
                    matrix[i][j] = 255;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        // 수정된 배열 출력
        System.out.println("임계값 적용 후 배열:");
        printMatrix(matrix);
        
        // Scanner 자원 해제
        scanner.close();
    }

    // 2차원 배열을 출력하는 메서드
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t"); // 각 요소를 탭으로 구분하여 출력
            }
            System.out.println(); // 행 출력 후 줄 바꿈
        }
    }
}

