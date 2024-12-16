/*2장 4번 문제. 여행 경비를 계산하는 프로그램을 작성한다.방 하나에는 2명까지 투숙 가능하며 1명만 투숙해도 1방의 비용을 집물한다.*/

import java.util.Scanner;

public class TravelCost {
    public static void main(String[] args) {

        // ㅅㅋㄴ
        Scanner scanner = new Scanner(System.in);
        
        
        // 여행지 입력하기
        System.out.print("여행지>>");
        String whereGo = scanner.nextLine();
        
        // 투숙할 인원 수 입력 요청하기
        System.out.print("인원수>>");
        int numberOfPeople = scanner.nextInt();
        
        // 숙박일 입력하기
        System.out.print("숙박일>>");
        int numberOfDay = scanner.nextInt();
        int numberDay = numberOfDay + 1;
        // 항공료 입력하기
        System.out.print("1인당 항공료>>");
        int AirPrice = scanner.nextInt();
        
        // 1방당 숙박비 입력하기
        System.out.print("1방 숙박비>>");
        int oneDayPrice = scanner.nextInt();
        
        // 필요한 방의 수 계산하기
        int numberOfRooms = (numberOfPeople + 1) / 2; // 2명당 1방, 1명일 경우도 1방

        // 총 비용 계산하기
        int totalCost = AirPrice * numberOfPeople;
        int totalCost2 = numberOfRooms * numberOfDay * oneDayPrice;
        int totalCost3 = totalCost+totalCost2;
        
        // 결과
        System.out.printf(numberOfPeople+"명의 "+whereGo+" "+numberOfDay+"박 "+numberDay+"일 여행에는 방이 "+numberOfRooms+"개 필요하며 경비는 "+totalCost3+"원 입니다.");
        
        // Scanner 닫기
        scanner.close();
    }
}
//1인당 항공료*인원수 + 방 개수 * 방 사용 날짜수