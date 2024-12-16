/*
ConcertHall 출력
*/

package Quection1214;

public class ConcertHall {
    private Seat[] seats;

    public ConcertHall() {
        seats = new Seat[3]; // S, A, B 좌석
        for (int i = 0; i < seats.length; i++) {
            seats[i] = new Seat();
        }
    }

    public boolean reserveSeat(int seatType, int seatNumber, String name) {
        return seats[seatType - 1].reserveSeat(seatNumber, name);
    }

    public boolean cancelReservation(int seatType, String name) {
        return seats[seatType - 1].cancelReservation(name);
    }

    public void showAllSeats() {
        seats[0].showSeats("S");
        seats[1].showSeats("A");
        seats[2].showSeats("B");
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }
}
