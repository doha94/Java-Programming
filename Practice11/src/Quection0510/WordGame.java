//10번 문제. 흩뿌려진 단어들을 조합하여 완성하는 단어게임.


package Quection0510;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class WordGame {
    public static void main(String[] args) {
        // JFrame 설정
        JFrame frame = new JFrame("Word Game"); // 창 제목 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 동작 설정
        frame.setSize(600, 400); // 창 크기 설정
        frame.setLayout(null); // 자유 배치 레이아웃 설정

        // 텍스트 목록 준비
        String[] sentences = {
                "Java is a programming language",
                "Swing is used for GUI development",
                "Practice makes perfect",
                "Object oriented programming"
        };

        // JLabel 생성 (완성된 문장을 표시)
        JLabel completedLabel = new JLabel("", SwingConstants.CENTER);
        completedLabel.setBounds(50, 300, 500, 30); // 위치 및 크기 설정
        completedLabel.setFont(new Font("Arial", Font.BOLD, 16)); // 폰트 설정
        frame.add(completedLabel); // JLabel 추가

        // JButton 생성 (New Text 버튼)
        JButton newTextButton = new JButton("New Text");
        newTextButton.setBounds(250, 20, 100, 30); // 위치 및 크기 설정
        frame.add(newTextButton); // 버튼 추가

        // ArrayList로 단어 라벨 관리
        ArrayList<JLabel> wordLabels = new ArrayList<>();
        Random random = new Random(); // 랜덤 위치 생성을 위한 Random 객체

        // 클릭 순서를 관리하는 리스트
        ArrayList<String> clickedWords = new ArrayList<>();
        StringBuilder targetSentence = new StringBuilder();

        // New Text 버튼 동작 설정
        newTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 이전 라벨 초기화
                for (JLabel wordLabel : wordLabels) {
                    frame.remove(wordLabel);
                }
                wordLabels.clear();
                clickedWords.clear();
                completedLabel.setText("");

                // 새로운 문장 랜덤 선택
                String sentence = sentences[random.nextInt(sentences.length)];
                targetSentence.setLength(0); // 이전 문장 초기화
                targetSentence.append(sentence);
                String[] words = sentence.split(" ");

                // 단어 섞기
                ArrayList<String> shuffledWords = new ArrayList<>();
                Collections.addAll(shuffledWords, words);
                Collections.shuffle(shuffledWords);

                // 각 단어를 JLabel로 생성
                for (String word : shuffledWords) {
                    JLabel wordLabel = new JLabel(word);
                    wordLabel.setFont(new Font("Arial", Font.PLAIN, 14)); // 폰트 설정
                    wordLabel.setOpaque(true); // 배경색을 보이게 설정
                    wordLabel.setBackground(Color.LIGHT_GRAY); // 배경색 설정
                    wordLabel.setBounds(random.nextInt(500), random.nextInt(200) + 50, 100, 30); // 랜덤 위치 설정

                    // 클릭 이벤트 설정
                    wordLabel.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            clickedWords.add(word); // 클릭한 단어 추가
                            completedLabel.setText(String.join(" ", clickedWords)); // 현재까지의 문장 표시

                            // 문장이 완성되었는지 확인
                            if (String.join(" ", clickedWords).equals(targetSentence.toString())) {
                                completedLabel.setText("Correct! " + targetSentence);
                            }
                        }
                    });

                    wordLabels.add(wordLabel); // 라벨 리스트에 추가
                    frame.add(wordLabel); // 프레임에 추가
                }

                frame.repaint(); // 화면 갱신
            }
        });

        // JFrame 보이기
        frame.setVisible(true);
    }
}
