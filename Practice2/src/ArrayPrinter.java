
public class ArrayPrinter {

    public static void main(String[] args) {
        // 주어진 2차원 배열 n
        int n[][] = { 
            {1, 2, 3}, 
            {1, 2}, 
            {1}, 
            {1, 2, 3}, 
            {1, 2, 3, 4} 
        };
        
        // 2차원 배열을 출력
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + "\t");  // 탭으로 간격 조정
            }
            System.out.println();  // 각 행이 끝나면 줄바꿈
        }
    }
}
