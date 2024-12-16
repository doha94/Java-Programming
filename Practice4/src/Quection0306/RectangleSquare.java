/*
6번 문제

다음 멤버를 가지고 사각형을 표현하는 Rectangle 클래스를 작성하라. 
- int 타입의 X, , width, height필드: 사각형을 구성하는 점과 크기 정보
- x, y, width, height를 매개변수로 전달받아 필드들을 초기화하는 생성자
- boolean isSquare(): 정사각형이면 true, 아니면 false 리턴

- boolean contains(Rectangle r): 현재 사각형 내부에 매개변수로 받은 사각형 r이 있으면 true, 아니면 false 리턴
- main() 메소드와 실행 결과는 다음과 같다.
public static void main(string[] args){
	Rectangle a = new Rectangle(3, 3, 6, 6);	//(3, 3) 점에서 6x6 크기의 사각형
	Rectangle b = new Rectangle(4, 4, 2, 3);	//(4, 4) 점에서 2x3 크기의 사각형

	a.show();

	if(a.isSquare()) System.out.println("a는 정사각형입니다.");
	else System.out.println("a는 직사각형입니다.");
	if(a.contains(b)) System.out.println("a는 b를 포함합니다.");
}

(3, 3)에서 크기가 6x6인 사각형	(a.show()에 의해 출력된 내용)
a는 정사각형입니다.
a는 b를 포함합니다.
*/

package Quection0306;

class Rectangle {
    // 필드 선언
    private int x;       // 사각형의 x좌표
    private int y;       // 사각형의 y좌표
    private int width;   // 사각형의 가로 길이
    private int height;  // 사각형의 세로 길이

    // 생성자: 필드 초기화
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // 사각형 정보를 출력하는 메소드
    public void show() {
        System.out.println("(" + x + ", " + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
    }

    // 정사각형 여부를 판별하는 메소드
    public boolean isSquare() {
        return width == height && width > 0;  // 가로와 세로가 같고 길이가 0보다 클 때 정사각형
    }

    // 현재 사각형이 매개변수로 받은 사각형을 포함하는지 판별하는 메소드
    public boolean contains(Rectangle r) {
        // 현재 사각형의 범위 내에 매개변수 사각형의 모든 좌표가 포함되는지 확인
        return this.x <= r.x && this.y <= r.y && 
               (this.x + this.width) >= (r.x + r.width) && 
               (this.y + this.height) >= (r.y + r.height);
    }
}

public class RectangleSquare {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(3, 3, 6, 6);   // (3, 3) 점에서 6x6 크기의 사각형
        Rectangle b = new Rectangle(4, 4, 2, 3);   // (4, 4) 점에서 2x3 크기의 사각형

        a.show();

        if (a.isSquare()) {
            System.out.println("a는 정사각형입니다.");
        } else {
            System.out.println("a는 직사각형입니다.");
        }

        if (a.contains(b)) {
            System.out.println("a는 b를 포함합니다.");
        } else {
            System.out.println("a는 b를 포함하지 않습니다.");
        }
    }
}
