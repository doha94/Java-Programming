/*
2. 저자, 도서명, 구입자 이름의 3개의 필드를 가지는 Book 클래스를 작성하라. 생성자는 저자, 도서명, 구입자를 매개변수로 전달받아 해당 필드를 초기화하고,
equals() 메소드는 두 Book 객체의 저자와 도서명만 같으면 같은 것으로 판별하도록 한다. Book 객체의 저자와 도서명만 같으면 같은 것으로 판별하도록 한다.
Book 클래스와 함께 다음 실행 예시와 같이 main()에서 Book 객체를 활용하는 BookApp클래스를 작성하라.

public static void main(String[] args) {
	Book a = new Book("황기태", "명품자바", "김하진");
	Book b = new Book("황기태", "명품자바", "하여린");
	System.out.println(a);
	System.out.println(b);
	if(a.equals(b))
		System.out.println("같은 책");
	else
		System.out.println("다른 책");
}
*/

package Quection0102;

//Book 클래스
class Book {
 private String author;
 private String title;
 private String buyer;

 // 생성자
 public Book(String author, String title, String buyer) {
     this.author = author;
     this.title = title;
     this.buyer = buyer;
 }

 // toString() 메소드 재정의
 @Override
 public String toString() {
     return buyer + "이 구입한 도서: " + author + "의 " + title;
 }

 // equals() 메소드 재정의
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     Book other = (Book) obj;
     return this.author.equals(other.author) && this.title.equals(other.title);
 }
}

//BookApp 클래스 (메인 클래스)
public class BookApp {
 public static void main(String[] args) {
     Book a = new Book("황기태", "명품자바", "김하진");
     Book b = new Book("황기태", "명품자바", "하여린");

     System.out.println(a);  // 김하진이 구입한 도서: 황기태의 명품자바
     System.out.println(b);  // 하여린이 구입한 도서: 황기태의 명품자바

     if (a.equals(b)) {
         System.out.println("같은 책");
     } else {
         System.out.println("다른 책");
     }
 }
}
