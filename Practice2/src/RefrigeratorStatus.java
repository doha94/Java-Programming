/*
 임베디드 컴퓨터에서는 변수의 각 비트를 장치의 상태를 나타내기 위해 사용한다. 예를들어 냉장고의 상태를 나타내기 위해 8비드 정수 중 하위 4비트가 다음과 같이 사용된다고 하자. 
비트 0(최하위 비트) : 값이 0이면 전원이 꺼져있고, 1이면 켜져있음
비트 1 : 값이 0이면 문이 열려 있고, 1이면 닫혀 있음.
비트 2 : 값이 0이면 냉장고 전구가 손상된 상태이고, 1이면 정상 작동
비트 3 : 값이 0이면 냉장고 온도가 3도 이상이고, 1이면 3도 미만
비트 4 이상 : 아무 의미 없음 
 */

import java.util.Scanner;  // 사용자로부터 입력을 받기 위해 Scanner 클래스를 사용

public class RefrigeratorStatus {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받기 위한 준비
        Scanner sc = new Scanner(System.in);
        
        // 사용자에게 입력을 요구하는 메시지 출력
        System.out.print("냉장고 상태 입력>> ");
        
        // 사용자로부터 입력을 받아 문자열로 저장 (8비트 이진수 형태로 입력됨)
        String input = sc.nextLine();
        
        // 입력된 2진수 문자열을 10진수 정수로 변환
        // Integer.parseInt(문자열, 2)는 2진수를 10진수로 변환하는 함수
        int status = Integer.parseInt(input, 2);
        
        // 비트 연산을 통해 각 상태를 확인 (status & 1은 하위 첫 번째 비트를 확인)
        // 첫 번째 비트: 전원 상태 (0이면 꺼짐, 1이면 켜짐)
        String powerStatus = (status & 1) == 1 ? "전원 켜져있음." : "전원 꺼져있음.";
        
        // 두 번째 비트: 문 상태 (0이면 열려있음, 1이면 닫혀있음)
        // status & 2는 두 번째 비트를 확인하는 연산
        String doorStatus = (status & 2) == 2 ? "문 닫혀있음." : "문 열려있음.";
        
        // 세 번째 비트: 전구 상태 (0이면 손상, 1이면 정상 작동)
        // status & 4는 세 번째 비트를 확인하는 연산
        String lightStatus = (status & 4) == 4 ? "전구 정상 작동." : "전구 손상.";
        
        // 네 번째 비트: 냉장고 온도 상태 (0이면 3도 이상, 1이면 3도 미만)
        // status & 8은 네 번째 비트를 확인하는 연산
        String tempStatus = (status & 8) == 8 ? "냉장고 온도 3도 미만." : "냉장고 온도 3도 이상.";
        
        // 위에서 확인한 각 상태를 출력
        System.out.println(powerStatus + " " + doorStatus + " " + lightStatus + " " + tempStatus);
        
        // 사용이 끝난 Scanner 객체를 닫아줌 (자원 해제)
        sc.close();
    }
}
