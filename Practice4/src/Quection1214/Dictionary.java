/*
다음은 같은 Dictionary 클래스가 있다. 실행 결과와 같이 작동하도록 Dictionary클래스에 korEng() 메소드를 작성하고, 실행결과와 같이 출력하는 DicApp클래스를 작성하라.
*/

package Quection1214;

public class Dictionary {
    // 한글과 대응하는 영어 단어 배열
    private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
    private static String[] eng = { "love", "baby", "money", "future", "hope" };

    // 한글 단어를 영어로 변환하는 메소드
    public static String kor2Eng(String word) {
        for (int i = 0; i < kor.length; i++) {
            if (kor[i].equals(word)) { // 한글 단어가 배열에 있는 경우
                return eng[i]; // 대응하는 영어 단어 리턴
            }
        }
        return null; // 단어가 없는 경우 null 리턴
    }
}
