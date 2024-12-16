/*	
12번 문제
*/	
	
package Quection12;
	
//추상 클래스 PainMap
abstract class PainMap {
	 protected String keyArray[]; // 키 문자열을 저장하는 배열
	 protected String valueArray[]; // 값 문자열을 저장하는 배열
	 
	 public PainMap(int size) {
	     keyArray = new String[size];
	     valueArray = new String[size];
	 }
	
	 abstract public String get(String key); // key 값으로 value 검색
	 abstract public void put(String key, String value); // key와 value를 저장
	 abstract public String delete(String key); // key 값을 가진 아이템 삭제
	 abstract public int length(); // 현재 저장된 아이템 개수 리턴
}
	
	//PainMap을 상속받은 Dictionary 클래스
class Dictionary extends PainMap {
	 private int itemCount; // 현재 저장된 아이템 개수
	
	 public Dictionary(int size) {
	     super(size);
	     itemCount = 0;
	 }
	
	 @Override
	 public String get(String key) {
	     for (int i = 0; i < itemCount; i++) {
	         if (keyArray[i].equals(key)) {
	             return valueArray[i];
	         }
	     }
	     return null; // 키를 찾을 수 없는 경우
	 }
	
	 @Override
	 public void put(String key, String value) {
	     for (int i = 0; i < itemCount; i++) {
	         if (keyArray[i].equals(key)) {
	             valueArray[i] = value; // 이미 존재하는 키의 값을 수정
	             return;
	         }
	     }
	     if (itemCount < keyArray.length) {
	         keyArray[itemCount] = key;
	         valueArray[itemCount] = value;
	         itemCount++;
	     } else {
	         System.out.println("Dictionary is full.");
	     }
	 }
	
	 @Override
	 public String delete(String key) {
	     for (int i = 0; i < itemCount; i++) {
	         if (keyArray[i].equals(key)) {
	             String deletedValue = valueArray[i];
	             // 삭제 후, 배열을 한 칸씩 앞으로 이동
	             for (int j = i; j < itemCount - 1; j++) {
	                 keyArray[j] = keyArray[j + 1];
	                 valueArray[j] = valueArray[j + 1];
	             }
	             keyArray[itemCount - 1] = null;
	             valueArray[itemCount - 1] = null;
	             itemCount--;
	             return deletedValue;
	         }
	     }
	     return null; // 삭제할 키를 찾을 수 없는 경우
	 }
	
	 @Override
	 public int length() {
	     return itemCount;
	 }
	}
	
	//DictionaryApp 클래스
public class DictionaryApp {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10); // Dictionary 객체 생성
	    
		// Key-Value 쌍 추가
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++"); // "이재문" 키의 값을 "C++"로 수정

		// Key로 Value 검색 및 출력
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	
		// Key 삭제 및 결과 확인
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}
}
