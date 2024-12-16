/*다음 프로그램에 대해 물음에 답하라.
int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
for(int i=0; i<n.length; i++){
	if(n[i] > 0&& n[i] % 4 ==0){
		System.out.print([i] + " ");
	}
}

1. 무엇을 계산하는 코드인가? 실행 결과 출력되는 내용은?
2. 위의 코드를 main() 메소드로 만들고ForLoopArray클래스로 완성하라.
3. while 문을 이용하여 동일하게 실행되는WhileLoopArray클래스를 작성하라.
4. do-while문을 이용하여 동일하게 실행되는 DoWhileLoopArray 클래스를 작성하라.*/

package Quection02;

public class ForLoopArray {
    public static void main(String[] args) {
        int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0 && n[i] % 4 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
