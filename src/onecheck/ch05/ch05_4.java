package onecheck.ch05;

import java.util.Scanner;

public class ch05_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("숫자를 입력하세요 (0을 입력하면 종료됩니다.) : ");
            num = sc.nextInt();
            System.out.println("입력 숫자는 " + num + "입니다.");
        } while (num != 0);
        System.out.println("프로그램을 종료합니다.");
    }
}