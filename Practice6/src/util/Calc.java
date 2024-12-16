/*
3번 문제
*/

package util;

public class Calc {
    private int x, y;

    // 생성자
    public Calc(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 두 숫자의 합을 반환
    public int sum() {
        return x + y;
    }
}