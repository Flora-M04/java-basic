public class pattern_5 {
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <4-row; col++) {
                System.out.print(+col + " ");
            }
            System.out.println();
        }
    }
}