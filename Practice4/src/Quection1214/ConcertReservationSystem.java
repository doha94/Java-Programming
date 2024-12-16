/*
ConcertHall 및 Seat 실행 코드(콘서트 예약, 조회, 취소등을 포함) 
*/

package Quection1214;

import java.util.Scanner;

public class ConcertReservationSystem {
    private ConcertHall hall;
    private Scanner scanner;

    public ConcertReservationSystem() {
        hall = new ConcertHall();
        scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>> ");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    reserve();
                    break;
                case 2:
                    hall.showAllSeats();
                    break;
                case 3:
                    cancel();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
    }

    private void reserve() {
        System.out.print("좌석구분 S(1), A(2), B(3) >> ");
        int seatType = scanner.nextInt();
        if (seatType < 1 || seatType > 3) {
            System.out.println("잘못된 좌석 구분입니다.");
            return;
        }

        hall.showAllSeats();
        System.out.print("이름 >> ");
        String name = scanner.next();
        System.out.print("번호 >> ");
        int seatNumber = scanner.nextInt();
        if (hall.reserveSeat(seatType, seatNumber, name)) {
            System.out.println("예약이 완료되었습니다.");
        } else {
            System.out.println("예약에 실패했습니다. 올바른 번호를 입력했는지 확인해주세요.");
        }
    }

    private void cancel() {
        System.out.print("좌석구분 S(1), A(2), B(3) >> ");
        int seatType = scanner.nextInt();
        if (seatType < 1 || seatType > 3) {
            System.out.println("잘못된 좌석 구분입니다.");
            return;
        }

        hall.showAllSeats();
        System.out.print("이름 >> ");
        String name = scanner.next();
        if (hall.cancelReservation(seatType, name)) {
            System.out.println("취소가 완료되었습니다.");
        } else {
            System.out.println("취소에 실패했습니다. 예약된 이름을 확인해주세요.");
        }
    }

    public static void main(String[] args) {
        ConcertReservationSystem system = new ConcertReservationSystem();
        system.run();
    }
}
