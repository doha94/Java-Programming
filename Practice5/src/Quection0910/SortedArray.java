/*
10번 문제
*/

package Quection0910;

import java.util.Scanner;

//SortedArray 클래스
class SortedArray extends BaseArray {

	 // 생성자: BaseArray의 생성자를 호출
	 public SortedArray(int size) {
	     super(size);
	 }
	
	 // add 메서드 오버라이드: 배열에 추가된 값이 항상 정렬되도록 유지
	 @Override
	 public void add(int n) {
	     if (nextIndex == array.length) return; // 배열이 꽉 차면 추가하지 않음
	     array[nextIndex++] = n; // 배열 끝에 값 추가
	     sortArray(); // 배열 정렬
	 }
	
	 // 배열 정렬 (내림차순)
	 private void sortArray() {
	     for (int i = 0; i < nextIndex - 1; i++) {
	         for (int j = i + 1; j < nextIndex; j++) {
	             if (array[i] > array[j]) { // 오름차순 정렬
	                 int temp = array[i];
	                 array[i] = array[j];
	                 array[j] = temp;
	             }
	         }
	     }
	 }
	
	 public static void main(String[] args) {
	     SortedArray sArray = new SortedArray(10); // SortedArray 객체 생성
	     Scanner scanner = new Scanner(System.in);
	     System.out.print(">>");
	
	     // 사용자 입력 처리
	     for (int i = 0; i < sArray.length(); i++) {
	         int n = scanner.nextInt();
	         sArray.add(n);
	     }
	
	     // 배열 출력
	     sArray.print();
	     scanner.close();
	 }
}
