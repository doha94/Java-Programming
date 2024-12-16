//10번 문제. 랜덤한 좌표에 숫자를 출력하기.

package Quection0510;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomNumberGUI extends JFrame {

    public RandomNumberGUI() {
        setTitle("West Grid 프레임"); // 프레임 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400); // 프레임 크기 설정
        setLayout(new BorderLayout()); // BorderLayout 사용

        // WEST 영역에 버튼 추가
        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(10, 1)); // 10개의 버튼을 세로로 배치
        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(); // 텍스트 없는 버튼 생성
            button.setBackground(new Color(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256))); // 랜덤 색상 설정
            button.setOpaque(true); // 색상이 보이도록 설정
            button.setBorderPainted(false); // 버튼 테두리 제거
            westPanel.add(button); // 패널에 버튼 추가
        }
        add(westPanel, BorderLayout.WEST); // WEST 영역에 패널 추가

        // CENTER 영역에 숫자 출력
        JPanel centerPanel = new JPanel(null); // 절대 위치 지정
        add(centerPanel, BorderLayout.CENTER); // CENTER 영역에 패널 추가

        JLabel numberLabel = new JLabel(); // 숫자를 표시할 레이블 생성
        numberLabel.setFont(new Font("Arial", Font.BOLD, 24)); // 레이블 폰트 설정
        centerPanel.add(numberLabel); // 패널에 레이블 추가

        // ActionListener로 버튼 클릭 시 랜덤 숫자 출력
        ActionListener showRandomNumber = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int randomNumber = random.nextInt(10); // 0~9 랜덤 숫자 생성
                int x = 50 + random.nextInt(151); // X 좌표 (50~200)
                int y = 50 + random.nextInt(151); // Y 좌표 (50~200)

                numberLabel.setText(String.valueOf(randomNumber)); // 랜덤 숫자를 레이블에 설정
                numberLabel.setBounds(x, y, 50, 50); // 레이블 위치 설정
            }
        };

        // WEST 패널의 버튼에 ActionListener 추가
        for (Component component : westPanel.getComponents()) {
            if (component instanceof JButton) {
                ((JButton) component).addActionListener(showRandomNumber);
            }
        }

        setVisible(true); // 프레임 표시
    }

    public static void main(String[] args) {
        new RandomNumberGUI(); // GUI 실행
    }
}