package ch12;

public class EvenCheck implements Check { // Check 인터페이스의 구현 클래스
    public boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }
}
