/*scanner 를 이용하여 양의 정수를 입력받고 다음과 같이 *를 출력하는 프로그램을 작성하라. 양의 정수가 입력될 때까지 계속 입력을 받도록 하라. 다음 실행 사례는 5를 입력받은 경우이다.

양의 정수 입력>>-2
양의 정수 입력>>5
*****
****
***
**
*
*/

package Quection0307;

import java.util.Scanner; // Scanner 클래스는 사용자 입력을 받기 위해 사용합니다.

public class StarPattern { // StarPattern 클래스 정의
    public static void main(String[] args) { // 프로그램의 시작점인 main 메서드
        Scanner scanner = new Scanner(System.in); // Scanner 객체를 생성하여 사용자 입력을 받을 준비를 합니다.
        int n; // 양의 정수를 저장할 변수 n을 선언합니다.

        // 사용자로부터 올바른 입력을 받을 때까지 반복합니다.
        while (true) { 
            System.out.print("양의 정수 입력>>"); // 사용자에게 입력을 요청합니다.
            n = scanner.nextInt(); // 사용자가 입력한 정수를 n에 저장합니다.

            if (n > 0) { // 입력된 값이 양의 정수인지 확인합니다.
                break; // 양의 정수일 경우 반복문을 종료합니다.
            }
        }

        // 입력된 정수를 기반으로 별 패턴을 출력합니다.
        for (int i = n; i > 0; i--) { // i는 n부터 시작하여 1씩 감소합니다.
            for (int j = 0; j < i; j++) { // i의 값만큼 별을 출력합니다.
                System.out.print("*"); // 별을 한 줄에 출력합니다.
            }
            System.out.println(); // 한 줄 출력이 끝나면 줄바꿈을 합니다.
        }

        scanner.close(); // Scanner 객체를 닫아 자원을 해제합니다.
    }
}
