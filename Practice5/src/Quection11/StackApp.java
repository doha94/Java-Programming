/*
11번 문제
*/

package Quection11;

import java.util.Scanner;

//IStack 인터페이스 정의
interface IStack {
 int capacity();       // 스택에 저장 가능한 최대 개수 리턴
 int length();         // 스택에 현재 저장된 개수 리턴
 boolean push(String val); // 스택의 꼭대기에 문자열 저장
 String pop();         // 스택의 꼭대기에 저장된 문자열 리턴
}

//StringStack 클래스: IStack 인터페이스 구현
class StringStack implements IStack {
 private String[] stack;   // 문자열을 저장할 배열
 private int top;          // 스택의 꼭대기 인덱스

 // 생성자: 스택의 용량을 설정
 public StringStack(int capacity) {
     stack = new String[capacity];
     top = 0; // 초기 스택은 비어 있음
 }

 // 스택의 최대 용량 리턴
 @Override
 public int capacity() {
     return stack.length;
 }

 // 스택에 저장된 현재 개수 리턴
 @Override
 public int length() {
     return top;
 }

 // 스택에 문자열 삽입
 @Override
 public boolean push(String val) {
     if (top == stack.length) return false; // 스택이 꽉 차면 false 리턴
     stack[top++] = val; // 스택의 꼭대기에 값 추가 후 인덱스 증가
     return true;
 }

 // 스택의 꼭대기에서 문자열 제거 및 리턴
 @Override
 public String pop() {
     if (top == 0) return null; // 스택이 비어 있으면 null 리턴
     return stack[--top]; // 꼭대기 값 리턴 후 인덱스 감소
 }
}

//StackApp 클래스: main() 메서드 포함
public class StackApp {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("스택 용량>> ");
     int capacity = scanner.nextInt(); // 스택의 최대 용량 입력
     scanner.nextLine(); // 개행 문자 제거

     // StringStack 객체 생성
     StringStack stack = new StringStack(capacity);

     while (true) {
         System.out.print("문자열 입력>> ");
         String input = scanner.nextLine();

         if (input.equals("그만")) { // "그만" 입력 시 종료
             break;
         }

         if (!stack.push(input)) { // 스택이 꽉 찬 경우
             System.out.println("스택이 꽉 차서 " + input + " 저장 불가");
         }
     }

     // 스택에 저장된 문자열 출력
     System.out.print("스택에 저장된 문자열 팝: ");
     String popped;
     while ((popped = stack.pop()) != null) {
         System.out.print(popped + " ");
     }
     scanner.close();
 }
}
