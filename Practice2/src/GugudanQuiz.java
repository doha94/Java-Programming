import java.util.Random; // 랜덤한 구구단 문제 생성을 위해 Random 클래스를 임포트
import java.util.Scanner; // 사용자 입력을 받기 위해 Scanner 클래스를 임포트

public class GugudanQuiz {
    public static void main(String[] args) {
        // 랜덤 숫자를 생성하기 위한 Random 객체 생성
        Random random = new Random();
        
        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        int incorrectCount = 0; // 틀린 횟수를 저장하는 변수 초기화
        
        System.out.println("***** 구구단을 맞추는 퀴즈입니다. *****"); // 게임 시작 메시지 출력
        
        while (incorrectCount < 3) { // 틀린 횟수가 3번 미만일 때 반복
            // 랜덤한 두 숫자(1~9) 생성
            int num1 = random.nextInt(9) + 1; // 1~9 사이의 숫자
            int num2 = random.nextInt(9) + 1; // 1~9 사이의 숫자
            
            // 정답 계산
            int correctAnswer = num1 * num2;
            
            // 문제 출력
            System.out.print(num1 + "x" + num2 + "="); // 사용자에게 문제를 출력
            
            int userAnswer = scanner.nextInt(); // 사용자의 답을 입력받음
            
            // 사용자의 답을 검사
            if (userAnswer == correctAnswer) {
                System.out.println("정답입니다. 잘했습니다."); // 정답일 경우 메시지 출력
            } else {
                incorrectCount++; // 틀린 경우 틀린 횟수 증가
                System.out.println(incorrectCount + "번 틀렸습니다. 분발하세요."); // 틀린 횟수 출력
            }
        }
        
        // 틀린 횟수가 3번이 되면 퀴즈 종료 메시지 출력
        System.out.println("3번 틀렸습니다. 퀴즈 종료합니다.");
        
        scanner.close(); // Scanner 객체를 닫아 리소스를 해제
    }
}
