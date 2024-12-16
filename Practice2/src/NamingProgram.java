import java.util.Scanner; // 사용자 입력을 받기 위해 Scanner 클래스를 임포트

public class NamingProgram {
    public static void main(String[] args) {
        // 사용자로부터 입력을 받기 위해 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 작명 프로그램 시작 메시지 출력
        System.out.println("***** 작명 프로그램이 실행됩니다. *****");
        
        while (true) { // 무한 루프, 사용자가 "그만"을 입력할 때까지 계속 실행
            System.out.print("남/여 선택>>"); // 사용자에게 성별 선택 입력 요청
            String gender = scanner.nextLine(); // 사용자가 입력한 성별을 저장
            
            // 사용자가 "그만"을 입력하면 프로그램 종료
            if (gender.equals("그만")) {
                break; // while 루프 탈출하여 프로그램 종료
            }
            
            // 성별이 "남" 또는 "여"인 경우에만 이름을 생성
            if (gender.equals("남") || gender.equals("여")) {
                System.out.print("성 입력>>"); // 성 입력 요청
                String lastName = scanner.nextLine(); // 성을 입력받음
                
                // 성별에 따른 이름 추천 로직
                if (gender.equals("남")) {
                    System.out.println("추천 이름: " + lastName + "민우"); // 남자의 이름 생성
                } else if (gender.equals("여")) {
                    System.out.println("추천 이름: " + lastName + "여린"); // 여자의 이름 생성
                }
                
            } else {
                // 성별이 "남", "여", "그만"이 아닌 경우 잘못된 입력 처리
                System.out.println("남/여/그만 중에서 입력하세요!"); // 잘못된 입력 메시지 출력
            }
        }
        
        // 프로그램 종료 메시지 출력
        System.out.println("프로그램을 종료합니다.");
        scanner.close(); // Scanner 객체 닫기
    }
}
