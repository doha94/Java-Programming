package Quection13;

//나눗셈 연산 클래스
class Div extends Calc {
@Override
public int calculate() {
   if (b == 0) { // 0으로 나누는 경우 오류 처리
       errorMsg = "0으로 나눌 수 없음. 프로그램 종료";
       throw new ArithmeticException(errorMsg);
   }
   return a / b;
}
}