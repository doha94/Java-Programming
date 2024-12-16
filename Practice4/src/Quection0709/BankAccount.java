/*
8번 문제

Account 클래스는 1개의 은행 계좌를 나타낸다. 실행 결과와 같이 출력되도록 Account클래스를 작성하라. 잔금이 인출하는 금액보다 작으면, 잔금만큼만 인출된다.

public static void main(Stringp[] args) {
	Account a = new Account(100);	//100원을 예금하면서 계좌 생성
	a.deposit(5000)l	//5000원 예금
	System.out.println("잔금은 " + a.getBalance() + "원입니다.");

	int bulk[] = { 100, 500, 200, 700 };
	a.deposit(bulk);	//bulk[]배열에 있는 모든 돈 예금
	System.out.print;n("잔금은 " + a.getBalance() + "원입니다.");

	int money = 1000;	//인출하고자 하는 금액
	int wMoney = a.withdraw(money);	//1000원 인출 시도. wMoney는 실제 인출한 금액
	if(wMoney < money);
		System.out.println(wMoney + "원만 인출");	//잔금이 1000원 보다 작은 경우
	else
		System.out.println(wMoney + "원 인출");	//잔금이 1000원보다 큰 경우

	System.out.println("잔금은 " + a.getBalance() + "원 입니다.");
}

잔금은 5100원 입니다.
잔금은 6600원 입니다.
1000원 인출
잔금은 5600원 입니다.


*/
package Quection0709;

class Account {
    private int balance; // 계좌 잔금

    // 생성자: 초기 잔금을 설정
    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    // 단일 금액 예금 메소드
    public void deposit(int amount) {
        balance += amount;
    }

    // 배열을 통한 일괄 예금 메소드
    public void deposit(int[] amounts) {
        for (int amount : amounts) {
            balance += amount;
        }
    }

    // 출금 메소드: 요청 금액만큼 출금하거나 잔금 부족 시 가능한 만큼만 출금
    public int withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return amount;
        } else {
            int withdrawnAmount = balance; // 가능한 만큼 출금
            balance = 0; // 잔금이 모두 소진됨
            return withdrawnAmount;
        }
    }

    // 현재 잔금 반환 메소드
    public int getBalance() {
        return balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account a = new Account(100); // 100원을 예금하며 계좌 생성
        a.deposit(5000); // 5000원 예금
        System.out.println("잔금은 " + a.getBalance() + "원입니다.");

        int bulk[] = {100, 500, 200, 700};
        a.deposit(bulk); // 배열을 통한 예금
        System.out.println("잔금은 " + a.getBalance() + "원입니다.");

        int money = 1000; // 인출하려는 금액
        int wMoney = a.withdraw(money); // 인출 시도
        if (wMoney < money) {
            System.out.println(wMoney + "원만 인출"); // 잔금이 부족한 경우
        } else {
            System.out.println(wMoney + "원 인출"); // 정상 인출
        }

        System.out.println("잔금은 " + a.getBalance() + "원입니다.");
    }
}
