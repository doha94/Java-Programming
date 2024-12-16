//10번 문제. 키 입력 및 드래깅 가능한 블록 생성 프로그램

package Quection0510;
import javax.swing.*; // GUI를 위한 Swing 라이브러리
import java.awt.*; // 그래픽 및 색상 처리를 위한 AWT 라이브러리
import java.awt.event.*; // 이벤트 처리를 위한 AWT 라이브러리
import java.util.Random; // 랜덤 숫자 생성을 위한 라이브러리

public class BlockMover extends JFrame {
    private JPanel contentPane; // 메인 컨테이너 패널

    public BlockMover() {
        setTitle("Block Mover Program"); // 프로그램 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 동작 설정
        setSize(400, 400); // 창 크기 설정
        contentPane = new JPanel(null); // 레이아웃을 null로 설정하여 자유롭게 배치 가능
        contentPane.setBackground(Color.WHITE); // 배경색 설정
        setContentPane(contentPane); // 메인 컨테이너로 설정

        // 키보드 이벤트 리스너 추가
        contentPane.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'm') { // 'm' 키를 눌렀을 때
                    createBlock(); // 새로운 블록 생성
                }
            }
        });
        contentPane.setFocusable(true); // 키보드 입력을 받을 수 있도록 설정
        contentPane.requestFocusInWindow(); // 창이 열릴 때 포커스 설정
    }

    // 새로운 블록을 생성하는 메서드
    private void createBlock() {
        Random random = new Random(); // 랜덤 객체 생성
        JLabel block = new JLabel(); // 블록 역할을 할 JLabel 생성
        block.setOpaque(true); // 배경색을 설정할 수 있도록 설정
        block.setBackground(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256))); // 랜덤 색상 설정
        block.setBounds(100, 100, 80, 80); // 블록의 초기 위치와 크기 설정
        
        // 마우스 드래그로 블록 이동 가능하도록 이벤트 추가
        block.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                block.putClientProperty("offset", e.getPoint()); // 클릭한 지점 저장
            }
        });
        block.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Point offset = (Point) block.getClientProperty("offset"); // 클릭한 지점 가져오기
                if (offset != null) {
                    Point newLocation = SwingUtilities.convertPoint(block, e.getPoint(), contentPane); // 새 위치 계산
                    block.setLocation(newLocation.x - offset.x, newLocation.y - offset.y); // 블록 위치 설정
                }
            }
        });

        contentPane.add(block); // 컨테이너에 블록 추가
        contentPane.repaint(); // 화면 갱신
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BlockMover frame = new BlockMover(); // 프로그램 인스턴스 생성
            frame.setVisible(true); // 창 보이기
        });
    }
}

