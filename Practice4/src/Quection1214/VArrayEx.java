/*
VArray 실행 코드

*/

package Quection1214;

public class VArrayEx {
    public static void main(String[] args) {
        VArray v = new VArray(5); // 초기 용량 5
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());

        for (int i = 0; i < 7; i++) {
            v.add(i); // 0~6 저장
        }
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        v.printAll();

        v.insert(3, 100); // 인덱스 3에 100 삽입
        v.insert(5, 200); // 인덱스 5에 200 삽입
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        v.printAll();

        v.remove(10); // 인덱스 10 삭제 시도 (잘못된 인덱스)
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        v.printAll();

        for (int i = 50; i < 55; i++) {
            v.add(i); // 50~54 추가
        }
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        v.printAll();
    }
}
