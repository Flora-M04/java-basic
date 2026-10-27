package pattern_codes;

public class pattern_8 {
    public static void main(String[] args) {
        for (int row = 1; row < 4; row++) {
            System.out.print(" ");
            for (int col = 1; col < row; col++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }
    }
}