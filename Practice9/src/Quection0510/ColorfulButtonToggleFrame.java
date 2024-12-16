//10번 문제 자체가 이해가 제대로 안돼서 만들어 본 프로그램.

package Quection0510;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;

public class ColorfulButtonToggleFrame extends JFrame {
    private JPanel centerPanel;
    private HashMap<JButton, JLabel> buttonLabels; // 버튼과 숫자 라벨의 매핑
    private Random random;

    public ColorfulButtonToggleFrame() {
        setTitle("West Grid 프레임"); // 프레임 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 설정
        setLayout(new BorderLayout()); // BorderLayout 사용

        random = new Random();
        buttonLabels = new HashMap<>(); // 버튼과 라벨의 매핑을 저장할 HashMap

        // WEST 영역에 버튼 추가
        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(10, 1)); // 10x1 버튼 레이아웃
        Color[] buttonColors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.PINK,
                                 Color.ORANGE, Color.MAGENTA, Color.CYAN, Color.GRAY, Color.LIGHT_GRAY};

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(); // 제목 없는 버튼 생성
            button.setBackground(buttonColors[i]); // 버튼 배경색 설정
            button.setOpaque(true);
            button.setBorderPainted(false);

            // 버튼 클릭 시 동작 추가
            button.addActionListener(new ButtonClickListener());
            westPanel.add(button);
        }

        add(westPanel, BorderLayout.WEST); // WEST 영역에 추가

        // CENTER 영역에 숫자 추가
        centerPanel = new JPanel(null); // 절대 위치 지정
        centerPanel.setBackground(Color.WHITE); // 배경색 흰색 설정
        add(centerPanel, BorderLayout.CENTER); // CENTER 영역에 추가

        setSize(600, 400); // 프레임 크기 설정
        setVisible(true); // 프레임 표시
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource(); // 클릭된 버튼 가져오기
            JLabel label = buttonLabels.get(button); // 버튼에 연결된 라벨 가져오기

            if (label == null) { // 라벨이 없으면 생성 후 표시
                label = new JLabel(String.valueOf(random.nextInt(10))); // 0~9 랜덤 숫자
                label.setFont(new Font("Arial", Font.BOLD, 20)); // 글꼴 설정

                // 랜덤 위치 설정
                int x = 50 + random.nextInt(150); // 50~200 범위의 X 좌표
                int y = 50 + random.nextInt(150); // 50~200 범위의 Y 좌표
                label.setBounds(x, y, 30, 30); // 라벨 위치와 크기 설정

                centerPanel.add(label); // CENTER 영역에 라벨 추가
                centerPanel.repaint(); // CENTER 영역 다시 그리기

                buttonLabels.put(button, label); // 버튼과 라벨 매핑 저장
            } else { // 라벨이 이미 있으면 제거
                centerPanel.remove(label); // CENTER 영역에서 라벨 제거
                centerPanel.repaint(); // CENTER 영역 다시 그리기

                buttonLabels.remove(button); // 버튼-라벨 매핑 제거
            }
        }
    }

    public static void main(String[] args) {
        new ColorfulButtonToggleFrame(); // 프레임 실행
    }
}
