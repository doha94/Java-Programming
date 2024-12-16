import java.util.Scanner; // 사용자 입력을 처리하기 위해 Scanner 클래스를 임포트

public class CourseGradeFinder {
    public static void main(String[] args) {
        // 과목명 배열, 5개의 과목을 저장
        String course[] = {"C", "C++", "Python", "Java", "HTML5"};
        
        // 학점 배열, 각 과목에 해당하는 학점을 저장
        String grade[] = {"A", "B+", "B", "A+", "D"};
        
        // 사용자 입력을 받기 위해 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        while (true) { // 무한 루프, 사용자가 "그만"을 입력할 때까지 계속 실행
            System.out.print("과목>>"); // 과목 입력 요청 메시지 출력
            String inputCourse = scanner.nextLine(); // 사용자로부터 과목명 입력받기
            
            if (inputCourse.equals("그만")) { // 입력된 과목명이 "그만"이면 프로그램 종료
                break; // while 루프를 탈출하여 프로그램 종료
            }
            
            boolean found = false; // 과목을 찾았는지 여부를 저장하는 변수, 기본값은 false
            
            // 입력된 과목명을 course 배열과 비교
            for (int i = 0; i < course.length; i++) { // 배열의 길이만큼 반복
                if (inputCourse.equals(course[i])) { // 입력된 과목이 배열에 있는지 비교
                    System.out.println(course[i] + " 학점은 " + grade[i]); // 과목명과 해당 과목의 학점 출력
                    found = true; // 과목을 찾았으므로 found를 true로 설정
                    break; // 과목을 찾았으므로 더 이상 반복할 필요 없이 루프 종료
                }
            }
            
            if (!found) { // 과목을 찾지 못한 경우
                System.out.println(inputCourse + "는 없는 과목입니다."); // 없는 과목임을 알리는 메시지 출력
            }
        }
        
        scanner.close(); // Scanner 리소스를 닫아 메모리 누수를 방지
    }
}
