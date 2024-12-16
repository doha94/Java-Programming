/*2장 1번 문제. Scanner 클래스를 이용하여 달러를 입력받아 실행 사례와 같이 원화로 바꾸는 프로그램을 작성하라. $1=1200원으로 가정한다.*/

import java.util.Scanner;

public class DollarConverter {
    public static void main(String[] args) {
        // Scanner 객체를 생성하기
        Scanner scanner = new Scanner(System.in);
        
        // 사용자에게 달러를 입력하라고 요청하기
        System.out.print("달러를 입력하세요>>");
        double dollars = scanner.nextDouble();
        
        // 환율 상수
        final double EXCHANGE_RATE = 1200.0;

        // 원화로 변환하기
        double won = dollars * EXCHANGE_RATE;

        // 결과 출력하기
        System.out.printf("$%.0f는 %.0f원입니다.%n", dollars, won);

        // 스캐너 닫기
        scanner.close();
    }
}
