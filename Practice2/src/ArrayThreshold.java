import java.util.Random; // 랜덤한 수 생성을 위한 Random 클래스를 임포트
import java.util.Scanner; // 사용자 입력을 받기 위한 Scanner 클래스를 임포트

public class ArrayThreshold {
    public static void main(String[] args) {
        // 4x4 크기의 2차원 배열 초기화
        int[][] array = new int[4][4];
        
        // 랜덤 숫자를 생성하기 위한 Random 객체 생성
        Random random = new Random();
        
        // 0~255 범위의 랜덤한 값을 배열에 저장
        for (int i = 0; i < 4; i++) { // 행을 순회
            for (int j = 0; j < 4; j++) { // 열을 순회
                array[i][j] = random.nextInt(256); // 0부터 255 사이의 랜덤 숫자를 배열에 저장
            }
        }

        // 초기 배열 출력
        System.out.println("4x4 배열에 랜덤한 값을 저장한 후 출력합니다.");
        printArray(array); // 배열 출력 메서드 호출

        // 사용자로부터 임계값 입력받기
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
        System.out.print("임계값 입력>>"); // 임계값 입력 요청
        int threshold = scanner.nextInt(); // 사용자 입력을 정수로 저장

        // 임계값에 따라 배열 수정
        for (int i = 0; i < 4; i++) { // 행을 순회
            for (int j = 0; j < 4; j++) { // 열을 순회
                if (array[i][j] > threshold) { // 배열 값이 임계값보다 큰 경우
                    array[i][j] = 255; // 255로 수정
                } else { // 배열 값이 임계값보다 작거나 같은 경우
                    array[i][j] = 0; // 0으로 수정
                }
            }
        }

        // 수정된 배열 출력
        printArray(array); // 수정된 배열 출력 메서드 호출
        
        scanner.close(); // Scanner 객체 닫기
    }

    // 2차원 배열을 출력하는 메서드
    private static void printArray(int[][] array) {
        for (int i = 0; i < 4; i++) { // 행을 순회
            for (int j = 0; j < 4; j++) { // 열을 순회
                System.out.print(array[i][j] + "\t"); // 배열의 값을 탭으로 구분하여 출력
            }
            System.out.println(); // 행이 끝난 후 줄 바꿈
        }
    }
}
