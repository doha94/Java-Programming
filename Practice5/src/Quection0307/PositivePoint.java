/*
6번 문제
*/

package Quection0307;


class PositivePoint extends Point {
    public PositivePoint() {
        // 기본 생성자: 기본 좌표 (1, 1)
        super(1, 1);
    }

    public PositivePoint(int x, int y) {
        // 좌표가 음수라면 기본값 (1, 1)로 초기화
        super(x > 0 ? x : 1, y > 0 ? y : 1);
    }

    @Override
    protected void move(int x, int y) {
        // 양수 좌표로만 이동 가능
        if (x < 3 && y < 3) {
            super.move(x, y);
        }
    }

    @Override
    public String toString() {
        // 객체를 "(x, y)" 형식의 문자열로 변환
        return "(" + getX() + ", " + getY() + ")의 점";
    }

    public static void main(String[] args) {
    	PositivePoint p = new PositivePoint(10, 10);	//(10, 10)의 점
    	p.move(5, 5);	//p는 (5, 5) 점
    	System.out.println(p.toString() + "입니다.");

    	p.move(2, -2);	//점 p는 양수공간만 가능. 그러므로 이동 없음
    	System.out.println(p.toString() + "입니다.");

    	PositivePoint q = new PositivePoint(-10, -10);	//음수 점 부루가. 디폴트(1, 1)의 점 생성

    	System.out.println(q.toString() + "입니다.");
    }

}
