import java.util.Random;
import java.util.Scanner;
import java.util.HashSet;

public class Main2 {

    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 배열에 저장할 정수의 개수를 입력받음
        System.out.print("정수를 몇 개 저장하시겠습니까>> ");
        int count = scanner.nextInt();
        
        // 랜덤한 정수를 저장할 배열 생성
        int[] numbers = new int[count];
        
        // 1~100 범위의 랜덤한 수를 중복 없이 저장하기 위한 HashSet 생성
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        Random random = new Random();
        
        // 중복되지 않는 정수를 배열에 저장
        int i = 0;
        while (uniqueNumbers.size() < count) {
            int randomNumber = random.nextInt(100) + 1;  // 1 ~ 100 사이의 랜덤 정수
            if (uniqueNumbers.add(randomNumber)) {
                numbers[i] = randomNumber;
                i++;
            }
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
        double average = sum / count;
        
        // 평균 출력
        System.out.println("평균은 " + average);
        
        // Scanner 객체 닫기
        scanner.close();
    }
}
