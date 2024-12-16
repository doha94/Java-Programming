/*
7번 문제
*/


package Quection0307;

class Point3DColor extends Point {
    private int z; // 3차원 점의 z 좌표
    private String color; // 점의 색상

    // 4개의 매개변수를 받는 생성자 (x, y, z, 색상)
    public Point3DColor(int x, int y, int z, String color) {
        super(x, y); // 부모 클래스 Point의 생성자 호출
        this.z = z; // z 좌표 초기화
        this.color = color; // 색상 초기화
    }

    // z 좌표를 반환하는 메서드
    public int getZ() {
        return z;
    }

    // z 좌표를 설정하는 메서드
    public void setZ(int z) {
        this.z = z;
    }

    // 점의 위치를 이동시키는 메서드 (x, y, z)
    public void move(int x, int y, int z) {
        super.move(x, y); // 부모 클래스의 move 메서드를 호출하여 x, y 좌표 이동
        this.z = z; // z 좌표 이동
    }

    // 다른 3차원 점으로 이동시키는 메서드
    public void move(Point3DColor other) {
        super.move(other.getX(), other.getY()); // 다른 점의 x, y 좌표로 이동
        this.z = other.getZ(); // 다른 점의 z 좌표로 이동
    }

    // 점의 정보를 문자열로 반환하는 메서드
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")" + color + "점";
    }

    // 점이 같은 위치와 색상인지 비교하는 메서드
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point3DColor) { // 비교 대상이 Point3DColor인지 확인
            Point3DColor other = (Point3DColor) obj;
            // x, y, z 좌표와 색상이 모두 동일한 경우 true 반환
            return this.getX() == other.getX() && this.getY() == other.getY() &&
                   this.z == other.getZ() && this.color.equals(other.color);
        }
        return false; // 비교 대상이 Point3DColor가 아닌 경우 false
    }

    // main 메서드 (테스트 코드)
    public static void main(String[] args) {
        // (10, 20, 30) 좌표에 "RED" 색상의 3차원 점 생성
        Point3DColor p = new Point3DColor(10, 20, 30, "RED");
        System.out.println(p.toString() + "입니다."); // 출력: (10, 20, 30)RED점입니다.

        // (1, 2, 3) 좌표에 "BLUE" 색상의 3차원 점 생성
        Point3DColor q = new Point3DColor(1, 2, 3, "BLUE");
        p.move(q); // p를 q의 위치로 이동
        System.out.println(p.toString() + "입니다."); // 출력: (1, 2, 3)RED점입니다.

        // (1, 2, 3) 좌표에 "RED" 색상의 3차원 점 생성
        Point3DColor r = new Point3DColor(1, 2, 3, "RED");
        // p와 r이 같은 위치와 색상인지 비교
        if (p.equals(r)) {
            System.out.println("예. 같은 위치 같은 색깔의 점입니다."); // 조건 일치 시 출력
        } else {
            System.out.println("아니오"); // 조건 불일치 시 출력
        }
    }
}

