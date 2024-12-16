package Pra2to2;

public class DoWhileLoop {

    public static void main(String[] args) {
        // 초기 변수 설정
        int sum = 0, i = 1;

        // do-while문을 이용하여 합 계산
        do {
            sum = sum + i;
            i += 3;
        } while (i <= 50);  // i 가 50 이하인 동안 반복

        // 결과 출력
        System.out.println(sum);
    }
}
