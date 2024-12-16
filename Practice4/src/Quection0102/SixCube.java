/*
2번 문제

Cube는 직육면체를 표현하는 클래스이다. 다음 main() 메소드와 실행 결과를 참고하여 Cube클래슬르 작성하라.
*/


package Quection0102;

class Cube {
    // 필드: 가로, 세로, 높이
    private int width;
    private int height;
    private int depth;

    // 생성자: 가로, 세로, 높이를 초기화
    public Cube(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // 부피 계산 메소드
    public int getVolume() {
        return width * height * depth;
    }

    // 크기 증가 메소드
    public void increase(int addWidth, int addHeight, int addDepth) {
        width += addWidth;
        height += addHeight;
        depth += addDepth;
    }

    // 부피가 0인지 확인하는 메소드
    public boolean isZero() {
        return getVolume() == 0;
    }
}

public class SixCube {
    public static void main(String[] args) {
        Cube cube = new Cube(1, 2, 3); // 가로, 세로, 높이 1, 2, 3인 큐브 생성
        System.out.println("큐브의 부피는 " + cube.getVolume());

        cube.increase(1, 2, 3); // 가로, 세로, 높이를 각각 1, 2, 3 증가
        System.out.println("큐브의 부피는 " + cube.getVolume());

        if (cube.isZero()) {
            System.out.println("큐브의 부피는 0");
        } else {
            System.out.println("큐브의 부피는 0이 아님");
        }
    }
}
