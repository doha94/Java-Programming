/*다음 2차원 배열 n 을 실행 사례와 같이 출력하는 프로그램을 작성하라.
int n [][] = {{1,2,3}, {1, 2}, {1}, {1, 2, 3}, {1, 2, 3, 4}};

실행결과
1	2	3
1	2
1
1	2	3
1	2	3	4*/

package Quection0307;

public class Print2DArray { // 클래스 정의
    public static void main(String[] args) { // main 메서드 시작
        // 2차원 배열 초기화
        int n[][] = { 
            {1, 2, 3},       // 첫 번째 행
            {1, 2},          // 두 번째 행
            {1},             // 세 번째 행
            {1, 2, 3},       // 네 번째 행
            {1, 2, 3, 4}     // 다섯 번째 행
        };

        // 배열을 행 단위로 순회하기 위해 첫 번째 for 문 사용
        for (int i = 0; i < n.length; i++) { // i 는 행의 인덱스를 의미
            // 각 행의 요소를 순회하기 위해 두 번째 for 문 사용
            for (int j = 0; j < n[i].length; j++) { // j 는 해당 행의 열의 인덱스를 의미
                System.out.print(n[i][j] + "\t"); // 현재 요소를 출력하고, 탭으로 구분
            }
            System.out.println(); // 한 행이 끝나면 줄바꿈을 수행
        }
    }
}
