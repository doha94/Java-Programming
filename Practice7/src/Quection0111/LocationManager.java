/*
7번 문제. Location 클래스를 사용한 도시 관리
 */


package Quection0111;

import java.util.*;

class Location {
    String city; // 도시 이름
    double longitude; // 경도
    double latitude; // 위도

    // Location 객체의 생성자
    public Location(String city, double longitude, double latitude) {
        this.city = city;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    // 객체 정보를 문자열로 반환하는 메서드
    @Override
    public String toString() {
        return city + "\t" + longitude + "\t" + latitude;
    }
}

public class LocationManager {
    public static void main(String[] args) {
        HashMap<String, Location> locations = new HashMap<>(); // 도시 정보를 저장할 HashMap 생성
        Scanner scanner = new Scanner(System.in);

        System.out.println("도시, 경도, 위도를 입력하세요.");
        System.out.println("단! (도시, 경도, 위도)와 같은 형식으로 작성해주시기 바랍니다.");
        for (int i = 0; i < 4; i++) { // 4개의 도시 정보 입력
            String input = scanner.nextLine();
            String[] parts = input.split(", "); // 입력을 ", "로 분리
            String city = parts[0];
            double longitude = Double.parseDouble(parts[1]);
            double latitude = Double.parseDouble(parts[2]);

            locations.put(city, new Location(city, longitude, latitude)); // HashMap에 저장
        }

        System.out.println("-----------------------------------");
        for (Location location : locations.values()) { // 저장된 도시 정보 출력
            System.out.println(location);
        }
        System.out.println("-----------------------------------");

        while (true) {
            System.out.print("도시 이름 >> ");
            String city = scanner.nextLine(); // 도시 이름 입력

            if (city.equals("그만")) { // "그만" 입력 시 프로그램 종료
                break;
            }

            if (locations.containsKey(city)) { // 입력한 도시가 목록에 있는 경우
                System.out.println(locations.get(city));
            } else { // 입력한 도시가 목록에 없는 경우
                System.out.println(city + "은(는) 없습니다.");
            }
        }

        scanner.close(); // Scanner 리소스 해제
    }
}