/*
배열은 정해진 크기 이상 저장할 수 없는 한계가 있다. 이 한계를 해소하는 가변 배열 클래스 VArray 를 만들어보자. 
VArray는 생성자를 통해 전달받은 크기로 내부에 배열을 만든다. VArray는 배열 크기를 넘어 계속 저장되면 내부 배열의 크기를 2배로 늘린다. 
VArray의 add()는 배열의 마지막 원소로 저장하며, insert()의 첫 번째 매개변수인 index값은 현재 배열에 저장된 크기를 넘을 수 없다. 독자들은 다음 main()메소드를 가진 VArrayEx클래스를 작성하고 실행 예시를 참고하여VArray클래스를 완성하라.
*/
package Quection1214;

public class VArray {
    private int[] arr;
    private int size; // 실제 저장된 원소 개수

    // 생성자: 초기 배열 크기 설정
    public VArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // 현재 배열의 용량 리턴
    public int capacity() {
        return arr.length;
    }

    // 현재 저장된 개수 리턴
    public int size() {
        return size;
    }

    // 배열에 원소 추가
    public void add(int value) {
        if (size == arr.length) {
            resize(); // 배열 크기 확장
        }
        arr[size++] = value; // 값 저장 후 size 증가
    }

    // 지정된 위치에 값 삽입
    public void insert(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        if (size == arr.length) {
            resize(); // 배열 크기 확장
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        size++;
    }

    // 지정된 인덱스의 값 제거
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    // 모든 원소 출력
    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 배열 크기 확장
    private void resize() {
        int newCapacity = arr.length * 2;
        int[] newArr = new int[newCapacity];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}
