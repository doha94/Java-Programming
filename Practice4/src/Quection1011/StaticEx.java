/*
11번 문제 출력 코드
*/


package Quection1011;

public class StaticEx {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 9};                    // 첫 번째 배열
        int[] array2 = {3, 6, -1, 100, 77};             // 두 번째 배열
        int[] array3 = ArrayUtil.concat(array1, array2); // 두 배열 연결

        ArrayUtil.print(array3);                        // 연결된 배열 출력
    }
}
