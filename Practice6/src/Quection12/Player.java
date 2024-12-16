package Quection12;

import java.util.*;

public class Player {
    private String name;  // 선수 이름
    private int chosenNumber;  // 선택한 숫자

    public Player(String name, int chosenNumber) {
        this.name = name;
        this.chosenNumber = chosenNumber;
    }

    // 이름 반환
    public String getName() {
        return name;
    }

    // 선택한 숫자 반환
    public int getChosenNumber() {
        return chosenNumber;
    }

    // 주어진 숫자 목록에서 선택한 숫자가 몇 번 등장하는지 세는 함수
    public int countMatches(List<Integer> randomNumbers) {
        int count = 0;
        for (int num : randomNumbers) {
            if (num == chosenNumber) {
                count++;
            }
        }
        return count;
    }
}
