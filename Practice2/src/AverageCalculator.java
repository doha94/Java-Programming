import java.util.ArrayList;
import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("양의 정수를 입력하세요. -1은 입력 끝>>");
        while (true) {
            String input = scanner.next();
            try {
                int num = Integer.parseInt(input);

                if (num == -1) {
                    break; // 입력 끝
                }

                if (num > 0) {
                    numbers.add(num); // 양의 정수만 리스트에 추가
                } else {
                    System.out.println(num + " 제외");
                }
            } catch (NumberFormatException e) {
                System.out.println(input + " 제외"); // 정수 외의 입력 처리
            }
        }

        if (!numbers.isEmpty()) {
            double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
            System.out.println("평균은 " + (int) average);
        } else {
            System.out.println("양의 정수가 입력되지 않았습니다.");
        }

        scanner.close();
    }
}
