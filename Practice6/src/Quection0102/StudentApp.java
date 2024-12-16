/*
다음 main()이 실행되면 예시와 같이 출력되도록, 학생 1명의 정보를 담은 Student클래스를 작성하고, main()을 포함하는 StudentApp클래스를 작성하라.
public static void main(String[] args) {
	Student a = new Student("황기태", 23);	//ID가 23인 황기태 학생
	Student b = new Student("황기태", 77);	//id가 77인 황기태 학생
	System.out.println(a);
	if(a.equals(b))
		System.out.println("같은 학생입니다.");
	else
		System.out.println("다른 학생입니다.");
}
*/


package Quection0102;

//Student 클래스
class Student {
 private String name;
 private int id;

 // 생성자
 public Student(String name, int id) {
     this.name = name;
     this.id = id;
 }

 // toString() 메소드 재정의
 @Override
 public String toString() {
     return "학번이 " + id + "인 " + name;
 }

 // equals() 메소드 재정의
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;  // 동일 객체 비교
     if (obj == null || getClass() != obj.getClass()) return false;  // 타입 확인
     Student other = (Student) obj;
     return this.name.equals(other.name) && this.id == other.id;  // 이름과 ID 비교
 }
}

//StudentApp 클래스 (메인 클래스)
public class StudentApp {
 public static void main(String[] args) {
     Student a = new Student("황기태", 23); // ID가 23인 황기태 학생
     Student b = new Student("황기태", 77); // ID가 77인 황기태 학생
     
     System.out.println(a);  // 학번이 23인 황기태 출력
     
     if (a.equals(b)) {
         System.out.println("같은 학생입니다.");
     } else {
         System.out.println("다른 학생입니다.");
     }
 }
}
