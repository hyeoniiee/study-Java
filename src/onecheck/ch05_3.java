package onecheck;

public class ch05_3 {
    public static void main(String[] args) {
        /*
        for (int i = 2; i <= 9; i++) {
            System.out.println("--- " + i + "단 ---");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
        */
        int i = 2;
        while (i <= 9){
            int j = 1;
            System.out.println("--- " + i + "단 ---");
            while (j <= 9) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            i++;
        }
    }
}
