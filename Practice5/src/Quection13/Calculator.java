/*
13번 문제 실행 클래스
*/


package Quection13;

//계산기 클래스
import java.util.Scanner;

public class Calculator {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     while (true) {
         System.out.print("두 정수와 연산자를 입력하시오>>");
         int a = scanner.nextInt();
         int b = scanner.nextInt();
         String operator = scanner.next();

         Calc calc = null;

         // 입력된 연산자에 따라 Calc 객체 생성
         switch (operator) {
             case "+":
                 calc = new Add();
                 break;
             case "-":
                 calc = new Sub();
                 break;
             case "*":
                 calc = new Mul();
                 break;
             case "/":
                 calc = new Div();
                 break;
             default:
                 System.out.println("지원하지 않는 연산자입니다. 프로그램 종료");
                 scanner.close();
                 return;
         }

         // 연산 수행
         try {
             calc.setValue(a, b);
             int result = calc.calculate();
             System.out.println("계산 결과 " + result);
         } catch (ArithmeticException e) {
             System.out.println(e.getMessage());
             scanner.close();
             return;
         }
     }
 }
}
