package Quection08;

import java.util.Scanner;

//재료를 담는 IngredientBox 클래스
class IngredientBox extends Box {
 private String name; // 재료의 이름

 // 생성자
 public IngredientBox(String name, int size) {
     super(size); // 부모 클래스 Box 의 생성자 호출
     this.name = name; // 재료 이름 초기화
 }

 // 재료를 소비하는 메서드
 @Override
 public boolean consume() {
     if (size > 0) { // 재료가 남아있으면
         size--; // 재료를 하나 소비
         return true; // 소비 성공
     }
     return false; // 소비 실패 (재료가 부족)
 }

 // 재료의 상태를 출력하는 메서드
 @Override
 public void print() {
     System.out.printf("%s ", name); // 재료 이름 출력
     for (int i = 0; i < size; i++) {
         System.out.print("*"); // 재료 양만큼 '*' 출력
     }
     System.out.println(); // 줄바꿈
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // 커피, 프림, 설탕을 담는 IngredientBox 객체 생성
     IngredientBox coffeeBox = new IngredientBox("커피", 5);
     IngredientBox creamBox = new IngredientBox("프림", 5);
     IngredientBox sugarBox = new IngredientBox("설탕", 5);

     System.out.println("*****청춘 커피 자판기 입니다.*****");

     while (true) {
         // 현재 상태 출력
         coffeeBox.print();
         creamBox.print();
         sugarBox.print();

         // 메뉴 선택
         System.out.print("다방커피: 1, 설탕커피: 2, 블랙커피: 3, 종료: 4>>");
         int choice = scanner.nextInt();

         if (choice == 4) { // 종료 선택
             System.out.println("청춘 커피 자판기 프로그램을 종료합니다.");
             break;
         }

         // 커피 제조
         boolean success = true;
         switch (choice) {
             case 1: // 다방커피 (커피 + 프림 + 설탕)
                 success = coffeeBox.consume() && creamBox.consume() && sugarBox.consume();
                 break;
             case 2: // 설탕커피 (커피 + 설탕)
                 success = coffeeBox.consume() && sugarBox.consume();
                 break;
             case 3: // 블랙커피 (커피만)
                 success = coffeeBox.consume();
                 break;
             default:
                 System.out.println("잘못된 선택입니다.");
                 continue;
         }

         if (!success) { // 재료 부족
             System.out.println("원료가 부족합니다.");
         }
     }

     scanner.close(); // Scanner 자원 해제
 }
}