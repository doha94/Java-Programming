package Quection14;

//GraphicEditor 클래스
import java.util.ArrayList;
import java.util.Scanner;

public class GraphicEditor {
 private ArrayList<Shape> shapes = new ArrayList<>(); // 도형을 저장하는 리스트

 public void insertShape() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Line(1), Rect(2), Circle(3)>>");
     int shapeType = scanner.nextInt();
     
     switch (shapeType) {
         case 1:
             shapes.add(new Line());
             break;
         case 2:
             shapes.add(new Rect());
             break;
         case 3:
             shapes.add(new Circle());
             break;
         default:
             System.out.println("잘못된 입력입니다.");
     }
 }

 public void deleteShape() {
     if (shapes.isEmpty()) {
         System.out.println("삭제할 도형이 없습니다.");
         return;
     }

     Scanner scanner = new Scanner(System.in);
     System.out.print("삭제할 도형의 위치>>");
     int index = scanner.nextInt();

     if (index < 1 || index > shapes.size()) {
         System.out.println("삭제할 수 없습니다.");
     } else {
         shapes.remove(index - 1);
     }
 }

 public void viewAllShapes() {
     for (Shape shape : shapes) {
         shape.draw();
     }
 }

 public void run() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Beauty Graphic Editor를 실행합니다.");

     while (true) {
         System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
         int command = scanner.nextInt();

         switch (command) {
             case 1:
                 insertShape();
                 break;
             case 2:
                 deleteShape();
                 break;
             case 3:
                 viewAllShapes();
                 break;
             case 4:
                 System.out.println("Beauty Graphic Editor를 종료합니다.");
                 return;
             default:
                 System.out.println("잘못된 입력입니다.");
         }
     }
 }

 public static void main(String[] args) {
     GraphicEditor editor = new GraphicEditor();
     editor.run();
 }
}
