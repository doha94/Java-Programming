/*
 1번 문제
 */

package Quection0102;

class TV{
	private int size;
	public TV(int size){ this.size = size; }
	protected int getSize() { return size; }
}

class TV2 extends TV {
    protected int color;

    // 생성자: TV의 size 와 color 를 초기화
    public TV2(int size, int color) {
        super(size); // 부모 클래스 TV의 생성자 호출
        this.color = color;
    }

    // TV 크기와 컬러 출력
    public void printProperty() {
        System.out.println(getSize() + "인치 " + color + "컬러");
    }
}



public class ColorTV {
    public static void main(String[] args) {
        TV2 myTv = new TV2(65, 65536); // 65인치 크기에 65536 컬러 TV
        myTv.printProperty(); // 출력: 65인치 65536컬러
    }
}
