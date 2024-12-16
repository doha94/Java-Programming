/*
간단한 콘서트 예약 시스템을 만들어보자. 다수의 클래스를 다루고 객체의 배열을 다루기에는 아직 자바 프로그램 개발이 익숙하지 않은 초보자에게 다소 무리가 있을 것이다. 그러나 반드시 넘어야 할 산이다. 이 도전을 통해 산을 넘어갈 수 있는 체력을 키워보자. 예약 시스템의 기능은 다음과 같다.
- 공연은 하루에 한 번 있다.
좌석은 S석, A석, B석으로 나뉘며, 각각 10개의 좌석이 있다.
- 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기"가 있다.
- 예약은 한 자리만 가능하고, 좌석 타입, 예약자 이름, 좌석 번호를 순서대로 입력받아야 예약한다.
- 조회는 모든 좌석을 출력한다.
- 취소는 예약자의 이름을 입력받아 취소한다.
없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소 등에 대해서 오류 메시지를 출력하고 사용자가 다시 시도하도록 한다.
*/
package Quection1214;

public class Seat {
    private String[] seats;

    public Seat() {
        seats = new String[10]; // 10개의 좌석 생성
        for (int i = 0; i < seats.length; i++) {
            seats[i] = "---"; // 초기 상태는 빈 좌석
        }
    }

    public boolean reserveSeat(int seatNumber, String name) {
        if (seatNumber < 1 || seatNumber > 10 || !seats[seatNumber - 1].equals("---")) {
            return false; // 유효하지 않은 번호 또는 이미 예약된 좌석
        }
        seats[seatNumber - 1] = name;
        return true;
    }

    public boolean cancelReservation(String name) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i].equals(name)) {
                seats[i] = "---";
                return true;
            }
        }
        return false; // 이름을 찾지 못한 경우
    }

    public void showSeats(String seatType) {
        System.out.print(seatType + ">> ");
        for (String seat : seats) {
            System.out.print(seat + " ");
        }
        System.out.println();
    }
}
