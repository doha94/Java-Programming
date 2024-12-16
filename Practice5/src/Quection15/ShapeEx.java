package Quection15;

//ShapeEx 클래스 (main 메소드 포함)
public class ShapeEx {
 public static void main(String[] args) {
     Shape[] list = new Shape[3]; // Shape 배열 생성

     list[0] = new Circle(5); // 반지름이 5인 원 객체
     list[1] = new Oval(20, 30); // 20X30인 사각형에 내접하는 타원 객체
     list[2] = new Rect(10, 40); // 10X40 크기의 사각형 객체

     for (int i = 0; i < list.length; i++) {
         list[i].redraw(); // 도형 다시 그리기
     }

     for (int i = 0; i < list.length; i++) {
         System.out.println("면적은 " + list[i].getArea()); // 도형의 면적 출력
     }
 }
}