package Pra2to1;

public class ForLoopArray {

    public static void main(String[] args) {
        // 주어진 배열
        int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
        
        // for 문을 이용하여 양수이면서 4의 배수인 값 출력
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0 && n[i] % 4 == 0) {
                System.out.print(n[i] + " ");
            }
        }
        System.out.println();  // 출력 후 줄바꿈
    }
}
