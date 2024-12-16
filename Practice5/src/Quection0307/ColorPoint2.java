/*
4번 문제
*/

package Quection0307;


class ColorPoint2 extends Point {
    private String color;

    public ColorPoint2() {
        super(0, 0); // (0, 0) 초기 위치 설정
        this.color = "WHITE"; // 기본 색상 "WHITE"
    }

    public ColorPoint2(int x, int y) {
        super(x, y); // 부모 클래스의 생성자를 호출하여 위치 설정
        this.color = "BLACK"; // 기본 색상 "BLACK"
    }

    public ColorPoint2(int x, int y, String color) {
        super(x, y); // 부모 클래스의 생성자를 호출하여 위치 설정
        this.color = color; // 색상 설정
    }

    public void set(int x, int y) {
        move(x, y); // 위치 이동
    }

    public void set(String color) {
        this.color = color; // 색상 변경
    }

    public double getDistance(ColorPoint2 other) {
        // 두 점 사이의 거리 계산
        int dx = getX() - other.getX();
        int dy = getY() - other.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        // 문자열로 객체 표현
        return color + "색의 (" + getX() + ", " + getY() + ")의 점";
    }

    public static void main(String[] args) {
        ColorPoint2 zeroPoint = new ColorPoint2(); // (0, 0) 위치의 "WHITE" 색 점
        System.out.println(zeroPoint.toString() + "입니다.");

        ColorPoint2 cp = new ColorPoint2(10, 10, "RED"); // (10, 10) 위치의 "RED" 색 점
        cp.set("BLUE"); // 색상 변경
        cp.set(10, 20); // 위치 변경
        System.out.println(cp.toString() + "입니다.");

        ColorPoint2 thresholdPoint = new ColorPoint2(100, 100); // (100, 100) 위치의 "BLACK" 점
        System.out.println("cp에서 임계점까지의 거리는 " + cp.getDistance(thresholdPoint));
    }
}


