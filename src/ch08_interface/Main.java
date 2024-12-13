package ch08_interface;

public class Main {
    public static void main(String[] args) {
        CheckingAccount myChecking = new CheckingAccount("123-4567-8901", 100000, 0.02);
        myChecking.displayAccountInfo();
        myChecking.withdraw(100000); // 출금
        myChecking.deposit(50000); // 입금
        myChecking.addInterest(); // 이자 계산 및 추가
        myChecking.displayAccountInfo();
    }
}
