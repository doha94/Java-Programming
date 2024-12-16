/*
7번 문제

1개의 메모 정보를 담는 Memo클래스를 작성하라. Memo는 생성자를 비롯하여 다음과 같은 필드와 메소드를 가진다.
- String타입의 name, time, content 필드	//메모 작성자, 메모 시점, 메모 텍스트
- boolean isSameName()	//메모 작성자가 같으면 true 리턴, 아니면 false리턴
- StringgetName()	//메모 작성자 이름 리턴
- void show()	//메모 출력
- int length()		//메모 텍스트의 길이 리턴

Memo객체를 생성하고 다루는 main함수와 살행 예시는 다음과 같다.
public static void main(String[] args) {
	Memo a = new Memo("유송연", "10:10", "자바 과제 있음")'
	Memo b = new Memo("박채원", "10:15", "시카고로 어학 연수가요!")'
	Memo c = new Memo("김경미", "11:30", "사랑하는 사람이 생겼어요.")'

	a.show();
	if(a.isSameName(b)) System.outprintln("동일한 사람입니다.");
	else System.out.println("다른 사람입니다.");
	System.out.println(c.getName() + "가 작성한 메모의 길이는 " + c.length());
}
유승연, 10:10 자바 과제 있음
다른 사람입니다.
김경미가 작성한 메모의 길이는 14
*/

package Quection0709;

class Memo {
    // 필드 선언
    private String name;    // 메모 작성자
    private String time;    // 메모 시점
    private String content; // 메모 내용

    // 생성자: 필드 초기화
    public Memo(String name, String time, String content) {
        this.name = name;
        this.time = time;
        this.content = content;
    }

    // 작성자가 같은지 비교하는 메소드
    public boolean isSameName(Memo other) {
        return this.name.equals(other.name); // 작성자 이름이 같으면 true 반환
    }

    // 작성자 이름을 반환하는 메소드
    public String getName() {
        return this.name;
    }

    // 메모 정보를 출력하는 메소드
    public void show() {
        System.out.println(name + ", " + time + " " + content);
    }

    // 메모 텍스트의 길이를 반환하는 메소드
    public int length() {
        return content.length();
    }
}

public class UserMemo {
    public static void main(String[] args) {
        // Memo 객체 생성
        Memo a = new Memo("유승연", "10:10", "자바 과제 있음");
        Memo b = new Memo("박채원", "10:15", "시카고로 어학 연수가요!");
        Memo c = new Memo("김경미", "11:30", "사랑하는 사람이 생겼어요.");

        // 메모 정보 출력
        a.show();

        // 작성자 비교
        if (a.isSameName(b)) {
            System.out.println("동일한 사람입니다.");
        } else {
            System.out.println("다른 사람입니다.");
        }

        // 메모 작성자와 내용 길이 출력
        System.out.println(c.getName() + "가 작성한 메모의 길이는 " + c.length());
    }
}
