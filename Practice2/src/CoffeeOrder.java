import java.util.Scanner;

public class CoffeeOrder {
    public static void main(String[] args) {
        // 커피와 가격 배열
        String coffee[] = {"핫아메리카노", "아이스아메리카노", "카푸치노", "라떼"};
        int price[] = {3000, 3500, 4000, 5000};
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("핫아메리카노, 아이스아메리카노, 카푸치노, 라떼 있습니다.");
        
        while (true) {
            System.out.print("주문>>");
            String order = scanner.nextLine();
            
            // 종료 조건
            if (order.equals("그만")) {
                System.out.println("주문을 종료합니다.");
                break;
            }

            boolean validMenu = false; // 유효한 메뉴인지 확인하는 변수

            // 주문에서 커피 메뉴와 수량을 분리
            for (int i = 0; i < coffee.length; i++) {
                if (order.startsWith(coffee[i])) {
                    validMenu = true; // 유효한 메뉴로 설정
                    String numberPart = order.substring(coffee[i].length()).trim(); // 메뉴명 뒤의 숫자 부분 추출

                    try {
                        // 숫자로 변환
                        int quantity = Integer.parseInt(numberPart);

                        if (quantity <= 0) {
                            System.out.println("잔 수는 양의 정수로 입력해주세요!");
                        } else {
                            // 가격 계산 및 출력
                            int totalPrice = price[i] * quantity;
                            System.out.println("가격은 " + totalPrice + "원 입니다.");
                        }
                    } catch (NumberFormatException e) {
                        // 숫자 변환 실패 시
                        System.out.println("잔 수는 양의 정수로 입력해주세요!");
                    }

                    break; // 메뉴를 찾았으므로 더 이상 반복할 필요 없음
                }
            }

            if (!validMenu) {
                System.out.println(order + "는 없는 메뉴입니다.");
            }
        }
        
        scanner.close();
    }
}
