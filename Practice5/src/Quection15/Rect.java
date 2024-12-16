package Quection15;

//Rect 클래스
class Rect implements Shape {
 private int width, height; // 사각형의 가로, 세로 길이

 public Rect(int width, int height) {
     this.width = width;
     this.height = height;
 }

 @Override
 public void draw() {
     System.out.println(width + "X" + height + "크기의 사각형");
 }

 @Override
 public double getArea() {
     return width * height;
 }
}