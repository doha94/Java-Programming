/*
4번 문제

다음 main() 메소드는 Average 클래스를 이용하여 정수를 저장하고 평균을 구하여 출력한다. 이 코드와 실행 결과를 참고하여 Average 클래스를 작성하라. Average클래스는 최대 10개까지만 정수를 저장할 수 있다.

public static void main(String[] args){
	Average avg = new Average();
	avg.put(10);	//10 저장
	avg.put(15);	//15 저장
	avg.put(100);	//100 저장
	avg.showAll();	//저장된 모든 원소 출력
	System.out.print("평균은 " + avg.getAvg());	//평균 출력
}

*****저장된 데이터 모두 출력*****
10 15 100
평균은 41.6666666666666664
*/

package Quection0306;

class Average {
    private int[] numbers;   // 정수를 저장할 배열
    private int count;       // 현재 저장된 정수의 개수

    // 생성자: 배열 초기화
    public Average() {
        numbers = new int[10];  // 최대 10개의 정수를 저장할 수 있는 배열 생성
        count = 0;              // 초기 저장된 개수는 0
    }

    // 정수를 저장하는 메소드
    public void put(int number) {
        if (count < 10) {       // 배열이 가득 차지 않았을 때만 저장
            numbers[count] = number;
            count++;            // 저장된 개수 증가
        } else {
            System.out.println("더 이상 저장할 수 없습니다.");
        }
    }

    // 저장된 모든 정수를 출력하는 메소드
    public void showAll() {
        System.out.println("*****저장된 데이터 모두 출력*****");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();   // 줄바꿈
    }

    // 평균을 계산하는 메소드
    public double getAvg() {
        if (count == 0) {       // 저장된 정수가 없을 경우 평균은 0
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }
        return (double) sum / count;  // 평균 계산 (실수형 반환)
    }
}

public class IntegerAverage {
    public static void main(String[] args) {
        Average avg = new Average();
        avg.put(10);    // 10 저장
        avg.put(15);    // 15 저장
        avg.put(100);   // 100 저장
        avg.showAll();  // 저장된 모든 원소 출력
        System.out.print("평균은 " + avg.getAvg());  // 평균 출력
    }
}
