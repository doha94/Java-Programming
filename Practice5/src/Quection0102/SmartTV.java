/*
 2번 문제
 */


package Quection0102;

class TV3 extends TV2 {
    private String ipAddress;

    // 생성자: IP 주소, TV 크기, 컬러 수 초기화
    public TV3(String ipAddress, int size, int color) {
        super(size, color); // 부모 클래스 ColorTV의 생성자 호출
        this.ipAddress = ipAddress;
    }

    // TV 정보 출력 (IP 주소 포함)
    @Override
    public void printProperty() {
        System.out.println("나의 SmartTV는 " + ipAddress + " 주소의 " + getSize() + "인치 " + color + "컬러");
    }
}



public class SmartTV {
    public static void main(String[] args) {
        TV3 smartTV = new TV3("192.168.0.5", 77, 20000000); // 192.168.0.5 주소의 77인치 20000000컬러 TV
        smartTV.printProperty(); // 출력: 나의 SmartTV는 192.168.0.5 주소의 77인치 20000000컬러
    }
}
