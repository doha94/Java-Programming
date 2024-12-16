/*
3번 문제
*/


package Quection0307;

//2차원 점을 표현하는 Point 클래스를 상속받아 색상을 가진 점을 나타내는 클래스
class ColorPoint extends Point {
 private String color; // 점의 색상을 저장하는 필드

 // 생성자: x, y 좌표와 색상을 받아 초기화
 public ColorPoint(int x, int y, String color) {
     super(x, y); // 부모 클래스(Point)의 생성자를 호출해 x, y 좌표 초기화
     this.color = color; // 색상 초기화
 }

 // 점의 색상을 설정하는 메서드
 public void setColor(String color) {
     this.color = color;
 }

 // 점의 위치를 설정하는 메서드
 public void setXY(int x, int y) {
     move(x, y); // 부모 클래스의 move() 메서드를 호출하여 위치 변경
 }

 // 점의 정보를 문자열로 반환하는 메서드
 @Override
 public String toString() {
     return color + " 색의 (" + getX() + ", " + getY() + ")의 점";
 }

 // main() 메서드: 실행 예시
 public static void main(String[] args) {
     ColorPoint cp = new ColorPoint(5, 5, "RED"); // (5, 5) 위치의 RED 색 점 생성
     cp.setXY(10, 20); // 점의 위치를 (10, 20)으로 변경
     cp.setColor("BLUE"); // 점의 색상을 BLUE로 변경
     String str = cp.toString(); // 점의 정보를 문자열로 반환
     System.out.println(str + "입니다."); // 점의 정보를 출력
 }
}
