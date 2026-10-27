package pattern_codes;

public class upper_right_triangle {
    public static void main(String[] args) {
        int row = 0;
        int col = 0;
        for (row = 0; row < 5; row++) {
            for (col = 0; col < 5; col++) {
                if (row - col <= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
            }
        }
    }