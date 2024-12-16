/*
3번 문제 실행 코드 작성하기.
*/

package main;

import util.Calc; // util 패키지의 Calc 클래스 임포트

public class MainApp {
    public static void main(String[] args) {
        Calc c = new Calc(10, 20); // Calc 객체 생성
        System.out.println(c.sum()); // 두 숫자의 합 출력
    }
}