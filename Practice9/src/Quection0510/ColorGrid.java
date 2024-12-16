//5번 문제. 스윙을 사용하며, 16가지의 색으로 바둑판 만들기.


package Quection0510;

import javax.swing.*; // 스윙 GUI 구성 요소 사용을 위한 패키지 임포트
import java.awt.*; // 레이아웃과 색상을 설정하기 위한 패키지 임포트

public class ColorGrid {
    public static void main(String[] args) {
        JFrame frame = new JFrame("4x4 Color 프레임"); // 새 JFrame 생성 및 제목 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 클릭 시 프로그램 종료

        frame.setSize(400, 400); // 프레임 크기 설정
        frame.setLayout(new GridLayout(4, 4)); // GridLayout으로 4x4 바둑판 설정

        // 16개의 색상을 배열로 정의
        Color[] colors = { 
            Color.WHITE, Color.GRAY, Color.RED, Color.BLUE,
            Color.GREEN, Color.YELLOW, Color.ORANGE, Color.PINK,
            Color.MAGENTA, Color.CYAN, Color.LIGHT_GRAY, Color.DARK_GRAY,
            Color.BLACK, new Color(128, 0, 128), new Color(0, 128, 128), new Color(128, 128, 0)
        };

        // 각 셀에 색상 추가
        for (Color color : colors) {
            JPanel panel = new JPanel(); // 새 JPanel 생성
            panel.setBackground(color); // 배경색 설정
            frame.add(panel); // 프레임에 패널 추가
        }

        frame.setVisible(true); // 프레임을 화면에 표시
    }
}
