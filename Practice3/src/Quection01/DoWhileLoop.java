/*
  다음 프로그램에 대해 물음에 답하라. 

int sum=0, i=1;
while(true) {
	if(i > 50)
		break;
	sum = sum + i;
	i += 3;
}
System.out.println(sum);

1. 무엇을 계산하는 코드인가? 실행 결과 출력되는 내용은?
2. 위의 코드를 main() 메소드로만들고 WhileLoop 클래스로 완성하라. 
3. for 문을 이용하여 동일하게 실행되는 ForLoop클래스를 작성하라.
4. do-while문을 이용하여 동일하게 실행되는 DoWhileLoop클래스를 작성하라.
 */
package Quection01;

public class DoWhileLoop {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        do {
            if (i > 50)
                break;
            sum = sum + i;
            i += 3;
        } while (true);
        System.out.println(sum);
    }
}
