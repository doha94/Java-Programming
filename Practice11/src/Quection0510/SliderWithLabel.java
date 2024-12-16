//5번 문제. 사용자가 슬라이더를 움직이면 레이블 컴포넌트에 수치로 보여주는 스윙 응용프로그램 작성.

package Quection0510;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderWithLabel {
    public static void main(String[] args) {
        // JFrame 생성 및 설정
        JFrame frame = new JFrame("Slider Example"); // 창 제목 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫을 때 프로그램 종료
        frame.setSize(400, 200); // 창 크기 설정
        frame.setLayout(new BorderLayout()); // BorderLayout 설정

        // JLabel 생성 및 초기 텍스트 설정
        JLabel label = new JLabel("Value: 100", SwingConstants.CENTER); // 텍스트를 가운데 정렬
        label.setFont(new Font("Arial", Font.BOLD, 20)); // 글꼴 및 크기 설정
        frame.add(label, BorderLayout.CENTER); // JLabel을 CENTER 영역에 추가

        // JSlider 생성 (100~200 범위, 초기값 100)
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 100, 200, 100);
        slider.setMajorTickSpacing(10); // 큰 눈금 간격 설정
        slider.setPaintTicks(true); // 눈금 보이기
        slider.setPaintLabels(true); // 숫자 라벨 보이기
        frame.add(slider, BorderLayout.SOUTH); // 슬라이더를 SOUTH 영역에 추가

        // 슬라이더 값 변경 리스너 추가
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // 슬라이더의 현재 값 가져오기
                int value = slider.getValue();
                // JLabel의 텍스트를 현재 값으로 업데이트
                label.setText("Value: " + value);
            }
        });

        // JFrame 보이기
        frame.setVisible(true); // 창 표시
    }
}
