import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // 4x4 크기의 2차원 배열 생성
        int[][] matrix = new int[4][4];
        
        // Random 클래스의 객체를 생성
        Random random = new Random();
        
        // 배열에 0~255 범위의 랜덤한 값을 저장
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(256);  // 0 ~ 255 범위의 랜덤 정수
            }
        }
        
        // 배열을 출력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");  // 탭을 이용하여 값 사이의 간격 조정
            }
            System.out.println();  // 각 행이 끝나면 줄바꿈
        }
    }
}
