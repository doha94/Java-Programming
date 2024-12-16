/*
3번 문제

Grade는 한 학생의 점수를 나타내는 크래스이다. 이름과 3개의 과목 점수를 각가가 입력받아 grade 객체를 생성하고 성적 평균을 출력하는 main()과 실행 예시는 다음과 같다. main()을 포함하는 Grade클래스를 작성하라.

이름, 자바, 우베프로그래밍, 운영체제 순으로 점수 입력>>박채원 99 85 95
박채원의 평균은 93
*/
package Quection0306;

import java.util.Scanner;

class Grade {
    // 필드 선언
    private String name;  // 학생 이름
    private int javaScore;  // 자바 점수
    private int webScore;   // 웹프로그래밍 점수
    private int osScore;    // 운영체제 점수

    // 생성자: 이름과 3개의 과목 점수를 초기화
    public Grade(String name, int javaScore, int webScore, int osScore) {
        this.name = name;
        this.javaScore = javaScore;
        this.webScore = webScore;
        this.osScore = osScore;
    }

    // 이름 반환 메소드
    public String getName() {
        return name;
    }

    // 평균 계산 메소드
    public double getAverage() {
        return (javaScore + webScore + osScore) / 3.0;
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 입력받기 위한 스캐너 생성
        System.out.print("이름, 자바, 웹프로그래밍, 운영체제 순으로 점수 입력>>");

        // 입력받은 값을 변수에 저장
        String name = scanner.next();    
        int java = scanner.nextInt();
        int web = scanner.nextInt();
        int os = scanner.nextInt();

        // Grade 객체 생성
        Grade st = new Grade(name, java, web, os);

        // 평균 출력
        System.out.println(st.getName() + "의 평균은 " + (int) st.getAverage()); 

        scanner.close();  // 스캐너 닫기
    }
}
