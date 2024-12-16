package Quection0107;

import javax.swing.*;  // GUI 라이브러리
import java.awt.event.*;  // 이벤트 라이브러리
import javax.sound.sampled.*;  // 오디오 재생 라이브러리
import java.io.*;  // 파일 입출력 라이브러리

public class AudioPlayer extends JFrame {
    private Clip audioClip; // 오디오 클립 객체

    public AudioPlayer() {
        // 프레임 설정
        setTitle("오디오 플레이어");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 메뉴바 생성
        JMenuBar menuBar = new JMenuBar();

        // "오디오" 메뉴 생성
        JMenu audioMenu = new JMenu("오디오");

        // "연주"와 "종료" 메뉴아이템 추가
        JMenuItem playItem = new JMenuItem("연주");
        JMenuItem stopItem = new JMenuItem("종료");

        audioMenu.add(playItem);
        audioMenu.add(stopItem);

        // 메뉴바에 "오디오" 메뉴 추가
        menuBar.add(audioMenu);
        setJMenuBar(menuBar);

        // "연주" 메뉴아이템 이벤트 처리
        playItem.addActionListener(e -> playAudio());

        // "종료" 메뉴아이템 이벤트 처리
        stopItem.addActionListener(e -> stopAudio());

        // GUI 표시
        setVisible(true);
    }

    // 오디오 재생
    private void playAudio() {
        // JFileChooser로 파일 선택
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File audioFile = fileChooser.getSelectedFile();
            try {
                // 오디오 스트림 및 클립 생성
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
                audioClip = AudioSystem.getClip();
                audioClip.open(audioStream);
                audioClip.start(); // 재생 시작
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "오디오 파일을 열 수 없습니다.", "오류", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // 오디오 중단
    private void stopAudio() {
        if (audioClip != null && audioClip.isRunning()) {
            audioClip.stop(); // 재생 중단
            audioClip.close(); // 자원 해제
        }
    }

    public static void main(String[] args) {
        // 프로그램 실행
        new AudioPlayer();
    }
}
