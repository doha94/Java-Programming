package Pra2to2;

public class WhileLoop {

    public static void main(String[] args) {
        // 초기 변수 설정
        int sum = 0, i = 1;

        // while 문을 이용하여 합 계산
        while (true) {
            if (i > 50)  // i 가 50을 넘으면 반복문 종료
                break;
            sum = sum + i;
            i += 3;  // i 는 3씩 증가
        }

        // 결과 출력
        System.out.println(sum);
    }
}
