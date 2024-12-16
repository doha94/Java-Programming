/*
17번 문제

다음과 같이 커피와 가격을 각각 배열로 만들고, 이를 활용하여 실행 사례와 같이 주문을 받아 가격을 계산하는 프로그램을 작성하라.
String coffee[] = {"핫아메리카노", "아이스아메리카노", "카푸치노", "라떼"};

int price[] = {3000, 3500, 4000, 5000};

핫아메리카노, 아이스아메리카노, 카푸치노, 라떼 있습니다.
주문>>아이스아메리카노 2
가격은 7000원 입니다.
주문>>라데 3
라데은 없는 메뉴입니다.
주문>>라떼 2잔	(InputMismatchException 예외 발생
찬 수는 양의 정수로 입력해주세요!
주문>라떼 3
가격은 15000원 입니다.
주문>>그만
*/

package Quection1618;

import java.util.Scanner;

public class CoffeeOrder {

    public static void main(String[] args) {
        String[] coffee = {"핫아메리카노", "아이스아메리카노", "카푸치노", "라떼"};
        int[] price = {3000, 3500, 4000, 5000};
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("핫아메리카노, 아이스아메리카노, 카푸치노, 라떼 있습니다.");

        while (true) {
            System.out.print("주문>> ");
            String input = scanner.nextLine().trim(); // 한 줄 입력받기

            // 종료 조건
            if (input.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 입력을 메뉴와 수량으로 분리
            try {
                String[] orderParts = input.split(" ");
                String menuName = orderParts[0]; // 메뉴 이름
                int quantity = Integer.parseInt(orderParts[1]); // 수량
                
                if (quantity <= 0) {
                    throw new NumberFormatException(); // 양의 정수가 아닌 경우 예외 발생
                }

                boolean found = false;
                for (int i = 0; i < coffee.length; i++) {
                    if (coffee[i].equals(menuName)) {
                        int totalPrice = price[i] * quantity;
                        System.out.println("가격은 " + totalPrice + "원 입니다.");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println(menuName + "은 없는 메뉴입니다.");
                }
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                System.out.println("잔 수는 양의 정수로 입력해주세요!");
            }
        }
        
        scanner.close(); // Scanner 자원 해제
    }
}
