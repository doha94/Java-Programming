/*
1번 문제

자바 클래스를 만들어보자. 다음 main() 메소드를 실해하였을 때 예시와 같이 출력되도록 TV클래스를 작성하라.
public static void main(String[] args) {
	TV tv = new TV("Samsung", 50, 300);	//300만원짜리 Samsung에서 만든 50인치 TV
	tv.show();
}
Samsung에서 만든 300만원 짜리의 50인치 TV
*/


package Quection0102;

class TV {
    // 필드 선언
    private String brand;   // 브랜드 이름
    private int size;       // 인치
    private int price;      // 가격(만원 단위)

    // 생성자
    public TV(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    // 메소드: TV 정보를 출력
    public void show() {
        System.out.println(brand + "에서 만든 " + price + "만원짜리의 " + size + "인치 TV");
    }
}

public class Samsung {
    public static void main(String[] args) {
        TV tv = new TV("Samsung", 50, 300); // 객체 생성 및 초기화
        tv.show(); // 출력 메소드 호출
    }
}
