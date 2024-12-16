/*
9번 문제
*/

package Quection0910;

import java.util.Scanner;

//BinaryArray 클래스
class BinaryArray extends BaseArray {
	 private int threshold; // 임계값
	
	 // 생성자: BaseArray 생성자 호출 및 임계값 초기화
	 public BinaryArray(int size, int threshold) {
	     super(size); // BaseArray의 생성자 호출
	     this.threshold = threshold;
	 }
	
	 // add 메서드 오버라이드: 임계값 기준으로 1 또는 0만 배열에 추가
	 @Override
	 public void add(int n) {
	     // n이 임계값보다 크면 1, 아니면 0을 배열에 추가
	     super.add(n > threshold ? 1 : 0);
	 }
	
	 public static void main(String[] args) {
	     int threshold = 50; // 임계값 설정
	     BinaryArray bArray = new BinaryArray(10, threshold); // BinaryArray 객체 생성
	
	     Scanner scanner = new Scanner(System.in);
	     System.out.print(">>");
	
	     // 사용자 입력으로 값 추가
	     for (int i = 0; i < bArray.length(); i++) {
	         int n = scanner.nextInt();
	         bArray.add(n);
	     }
	
	     // 배열 출력
	     bArray.print();
	     scanner.close();
	 }
}
