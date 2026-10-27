package pattern_codes;

public class Floyds_Triangle {
    public static void main(String[] args) {
        int num = 1;
        for (int row = 0; row <= 4; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}