/*52장 문제. 화면에 자신의 이름, 나이, 하고가 등의 정보를 출력하는 자바 응용프로그램을 작성하라. 이클립스를 사용하여 openChallenge1이라는 이름의 프로젝트를 만들고, 클래스 이름을  MyInfoApp로 하라. 그러면 MyInfoApp.java파일로 자동 저장된다. 프로그램을 실행하면 다음과 같이 출력된다.*/
public class MyInfoApp {
    public static void main(String[] args) {
        // 사용자 정보에 대해서
        String name = "Kitae Hwang"; // 이름
        int age = 20; //나이
        String department = "Department of Computer Engineering"; //학과

        // 정보 출력하기
        System.out.println(name);
        System.out.println(age + " years old");
        System.out.println(department);
    }
}