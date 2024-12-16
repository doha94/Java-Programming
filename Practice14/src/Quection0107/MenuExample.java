package Quection0107;

import javax.swing.*; // GUI 컴포넌트 라이브러리
import java.awt.*;    // 기본 AWT 클래스 라이브러리

public class MenuExample extends JFrame {
    public MenuExample() {
        // 프레임 설정
        setTitle("메뉴 구성 프로그램"); // 창 제목
        setSize(400, 200);            // 창 크기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 동작 설정
        
        // 메뉴바 생성
        JMenuBar menuBar = new JMenuBar();

        // 메뉴 생성
        JMenu fileMenu = new JMenu("파일");
        JMenu editMenu = new JMenu("편집");
        JMenu viewMenu = new JMenu("보기");
        JMenu inputMenu = new JMenu("입력");

        // "보기" 메뉴에 메뉴아이템 추가
        JMenuItem zoomInItem = new JMenuItem("화면확대");
        JMenuItem pageOutlineItem = new JMenuItem("쪽윤곽");

        viewMenu.add(zoomInItem);     // "화면확대" 추가
        viewMenu.add(pageOutlineItem); // "쪽윤곽" 추가

        // 메뉴바에 메뉴 추가
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(inputMenu);

        // 프레임에 메뉴바 설정
        setJMenuBar(menuBar);

        // GUI 표시
        setVisible(true);
    }

    public static void main(String[] args) {
        // 프로그램 실행
        new MenuExample();
    }
}
