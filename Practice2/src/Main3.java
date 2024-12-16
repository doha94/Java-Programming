import java.util.Random;

public class Main3 {

    public static void main(String[] args) {
        // 정수 10개를 저장할 배열 생성
        int[] numbers = new int[10];
        
        // Random 객체 생성
        Random random = new Random();
        
        // 배열에 11~19 범위의 랜덤한 정수를 저장
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(9) + 11;  // 11 ~ 19 범위의 정수 생성
        }
        
        // 저장된 랜덤한 정수들 출력
        System.out.print("랜덤한 정수들... ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // 평균 계산
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        
        // 평균 출력
        System.out.println("평균은 " + average);
    }
}
