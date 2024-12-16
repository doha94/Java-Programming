//5번 문제. 클릭 연습하는 프로그램


package Quection0510;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ClickPractice extends JFrame {
    private CPanel cPanel; // "C" 모양을 그리는 패널
    private Random random; // 랜덤 위치 생성을 위한 Random 객체

    public ClickPractice() {
        setTitle("클릭 연습 프로그램"); // 프레임 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 동작 설정
        setSize(400, 400); // 프레임 크기 설정
        setLayout(null); // 자유 배치 관리자 사용

        // "C" 모양을 그리는 패널 생성
        cPanel = new CPanel();
        cPanel.setSize(50, 50); // 패널 크기 설정
        cPanel.setLocation(100, 100); // 패널의 초기 위치 설정
        add(cPanel); // 패널을 프레임에 추가

        random = new Random(); // 랜덤 객체 생성

        // 패널 클릭 이벤트 추가
        cPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // 클릭할 때 패널 위치를 랜덤하게 변경
                int x = random.nextInt(getWidth() - cPanel.getWidth());
                int y = random.nextInt(getHeight() - cPanel.getHeight());
                cPanel.setLocation(x, y); // 패널의 새 위치 설정
            }
        });

        setVisible(true); // 프레임을 보이도록 설정
    }

    // "C" 모양을 그리는 JPanel 클래스
    class CPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // 안티앨리어싱 적용
            g2.setColor(Color.ORANGE); // "C"의 색상 설정
            g2.setStroke(new BasicStroke(5)); // "C"의 두께 설정

            // "C" 그리기
            g2.drawArc(5, 5, getWidth() - 10, getHeight() - 10, 45, 270); // 원호를 그려 "C" 모양 생성
        }
    }

    public static void main(String[] args) {
        new ClickPractice(); // 프로그램 실행
    }
}

