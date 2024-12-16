/*
 자동차 제어 장치에는 자동차의 상태를 나타내는 정수형 변수가 있다. 이 변수의 각 비트는 다음과 같이 자동차의 상태를 나타낸다고 하자. 
비트 0~5 : 현재 자동차 내 온도 값으로, 십진수로는 0~31의 값
비트 6 : 값이 0이면 에어컨이 꺼져 있는 상태, 1이면 켜져있는 상태
비트 7 : 값이 0이면 자동차가 정지 상태, 1이면 달리는 상태
비트 8이상 : 아무 의미 없음

예를 들어, 자동차의 상태를 나타내는 정수형 변수의 값이 139 이라면, 이 값은 이진수로 1001011이므로 비트 7의 값이 1이고, 비트 6의 값이 0이며, 비트 0~5의 값이 십진수로 11이다. 그러므로 자동차는 '달리는 상태' 이고, 에어컨은 '꺼진 상태' 이며, 차내 온도는 '11도'이다.
자동차 상태를 나타내는 정수를 입력받아 자동차의 상태를 화면에 출력하는 프로그램을 작성하라. 
*/

import java.util.Scanner;

public class CarControlSystem {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 사용자에게 자동차 상태 입력을 요구
        System.out.print("자동차 상태 입력>> ");
        
        // 입력을 받아서 정수로 저장
        int carStatus = sc.nextInt();
        
        // 비트 0~5 : 온도 값 추출 (5비트 마스크 사용, 31은 5비트를 전부 1로 만든 값)
        int temperature = carStatus & 31;
        
        // 비트 6 : 에어컨 상태 확인
        String airConditioner = (carStatus & 64) == 64 ? "켜진 상태" : "꺼진 상태";
        
        // 비트 7 : 자동차 상태 확인
        String carMovement = (carStatus & 128) == 128 ? "달리는 상태" : "정지 상태";
        
        // 상태 출력
        System.out.println("자동차는 " + carMovement + "이고 에어컨이 " + airConditioner + "이고 온도는 " + temperature + "도 이다.");
        
        // Scanner 닫기 (자원 해제)
        sc.close();
    }
}