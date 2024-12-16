/*
다음 2개의 static 속성을 가진 ArrayUtil 클래스를 만들어보자. 다음 코드와 실행 결과를 참고하여 concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하라.
*/


package Quection1011;

public class ArrayUtil {
    // 배열 a 와 b 를 연결한 새로운 배열을 생성하여 리턴하는 메소드
    public static int[] concat(int[] a, int[] b) {
        int[] result = new int[a.length + b.length]; // a와 b의 길이 합만큼 새로운 배열 생성

        // 배열 a 의 모든 요소 복사
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        // 배열 b 의 모든 요소 복사
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i]; // a 길이 이후부터 b 요소 추가
        }

        return result; // 연결된 새 배열 리턴
    }

    // 배열의 요소를 공백으로 구분하여 출력하는 메소드
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " "); // 요소 출력 후 공백 추가
        }
        System.out.println(); // 줄 바꿈
    }
}
