/*
13번 문제 제공 클래스
*/

package Quection13;

//추상 클래스 Calc
abstract class Calc {
 protected String errorMsg = null; // 오류 메시지 저장
 protected int a, b; // 피연산자

 // 피연산자 값을 설정하는 메소드
 public void setValue(int a, int b) {
     this.a = a;
     this.b = b;
 }

 // 연산 결과를 리턴하는 추상 메소드
 public abstract int calculate();
}