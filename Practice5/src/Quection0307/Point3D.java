/*
5번 문제
*/
package Quection0307;

//2차원 점(Point)을 상속받아 3차원 점을 표현하는 클래스
class Point3D extends Point {
	 public int z; // z 좌표를 저장하는 필드
	
	 // 생성자: x, y, z 좌표를 받아 초기화
	 public Point3D(int x, int y, int z) {
	     super(x, y); // 부모 클래스(Point)의 생성자를 호출해 x, y 좌표 초기화
	     this.z = z; // z 좌표 초기화
	 }
	
	 // z 축으로 위로 이동하는 메서드
	 public void moveUp(int distance) {
	     z += distance;
	 }
	
	 // z 축으로 아래로 이동하는 메서드
	 public void moveDown(int distance) {
	     z -= distance;
	 }
	
	 // x, y 좌표만 변경하는 메서드
	 public void move(int x, int y) {
	     super.move(x, y); // 부모 클래스의 move() 호출
	 }
	
	 // x, y, z 좌표를 모두 변경하는 메서드
	 public void move(int x, int y, int z) {
	     super.move(x, y); // 부모 클래스의 move() 호출
	     this.z = z;
	 }
	
	 // 점의 정보를 문자열로 반환하는 메서드
	 @Override
	 public String toString() {
	     return "(" + getX() + ", " + getY() + ", " + z + ")의 점";
	 }
	
	 // main() 메서드: 실행 예시
	 public static void main(String[] args) {
	     Point3D p = new Point3D(3, 2, 1); // (3, 2, 1) 위치의 3D 점 생성
	     System.out.println(p.toString() + "입니다."); // 점 정보 출력
	
	     p.moveUp(3); // z 축으로 3만큼 이동
	     System.out.println(p.toString() + "입니다."); // 점 정보 출력
	
	     p.moveDown(2); // z 축으로 2만큼 이동
	     System.out.println(p.toString() + "입니다."); // 점 정보 출력
	
	     p.move(5, 5); // x, y 좌표를 (5, 5)로 이동
	     System.out.println(p.toString() + "입니다."); // 점 정보 출력
	
	     p.move(100, 200, 300); // x, y, z 좌표를 (100, 200, 300)으로 이동
	     System.out.println(p.toString() + "입니다."); // 점 정보 출력
	 }
}
