package Pra2to2;

public class ForLoop {

    public static void main(String[] args) {
        // 초기 변수 설정
        int sum = 0;

        // for 문을 이용하여 합 계산
        for (int i = 1; i <= 50; i += 3) {
            sum = sum + i;
        }

        // 결과 출력
        System.out.println(sum);
    }
}
