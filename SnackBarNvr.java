/*2장 3번 문제. 분식점 가격 계산 프로그램을 작성해보자. 떡볶이 1인분은 2000원, 김말이 1인분은 1000원, 쫄면 1인분은 3000원 이다.*/

import java.util.Scanner;

public class SnackBarNvr {
    public static void main(String[] args) {
        // 가격 상수
        final int TTEOKBOKKI_PRICE = 2000; // 떡볶이 1인분
        final int KIMBAP_PRICE = 1000; // 김말이 1인분
        final int JJAJANG_PRICE = 3000; // 쫄면 1인분
        
        // 첫마디
        System.out.println("**** 자바 부식입니다. 주문하면 금액을 알려드립니다. ****");
        
        //스캐너
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 주문 입력 요청하기
        System.out.print("떡볶이 몇 인분>>");
        int tteokbokkiCount = scanner.nextInt();
        
        System.out.print("김말이 몇 인분>>");
        int kimbapCount = scanner.nextInt();
        
        System.out.print("쫄면 몇 인분>>");
        int jjajangCount = scanner.nextInt();

        // 총 가격 계산하기
        int totalPrice = (tteokbokkiCount * TTEOKBOKKI_PRICE) +
                         (kimbapCount * KIMBAP_PRICE) +
                         (jjajangCount * JJAJANG_PRICE);

        // 결과 출력하기
        System.out.printf("전체 금액은 %d원입니다.%n", totalPrice);

        // Scanner 닫기
        scanner.close();
    }
}