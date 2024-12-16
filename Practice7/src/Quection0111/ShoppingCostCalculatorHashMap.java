/*
4번 문제. 쇼핑 후 전체 경비를 계산하는 프로그램 작성하기.
 */


package Quection0111;

import java.util.*;

public class ShoppingCostCalculatorHashMap {
    public static void main(String[] args) {
        // 품목과 가격을 저장하는 HashMap 생성
        HashMap<String, Integer> items = new HashMap<>();
        items.put("고추장", 3000);
        items.put("만두", 500);
        items.put("새우깡", 1500);
        items.put("콜라", 600);
        items.put("참치캔", 2000);
        items.put("치약", 1000);
        items.put("연어", 2500);
        items.put("삼겹살", 2500);

        Scanner scanner = new Scanner(System.in); // 사용자 입력을 위한 Scanner 객체

        System.out.println("쇼핑 비용을 계산해드립니다. 구입 가능한 물건과 가격은 다음과 같습니다.");
        for (Map.Entry<String, Integer> entry : items.entrySet()) { // HashMap의 항목 출력
            System.out.println("[" + entry.getKey() + ", " + entry.getValue() + "]");
        }

        while (true) {
            System.out.print("물건과 개수를 입력하세요>> ");
            String input = scanner.nextLine(); // 사용자 입력 받기

            if (input.equals("그만")) { // "그만" 입력 시 프로그램 종료
                break;
            }

            String[] parts = input.split(" "); // 입력을 공백으로 분리

            if (parts.length % 2 != 0) { // 입력 형식이 잘못된 경우
                System.out.println("입력에 문제가 있습니다.!");
                continue;
            }

            int totalCost = 0; // 전체 비용 계산을 위한 변수
            boolean isError = false; // 입력 오류 여부 확인

            for (int i = 0; i < parts.length; i += 2) {
                String item = parts[i]; // 물건 이름
                int quantity;

                try {
                    quantity = Integer.parseInt(parts[i + 1]); // 물건 개수
                } catch (NumberFormatException e) {
                    System.out.println("입력에 문제가 있습니다.!");
                    isError = true;
                    break;
                }

                if (!items.containsKey(item)) { // 물건이 목록에 없는 경우
                    System.out.println(item + "은(는) 없는 상품입니다!");
                    isError = true;
                    break;
                }

                totalCost += items.get(item) * quantity; // 물건 가격 * 개수
            }

            if (!isError) {
                System.out.println("전체 비용은 " + totalCost + "원 입니다.");
            }
        }

        scanner.close(); // Scanner 리소스 해제
    }
}