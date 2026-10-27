package pattern_codes;
import java.sql.SQLOutput;
import java.util.Scanner;
public class left_rightangle_traiangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                    System.out.print(row);
            } System.out.println();
        }


    }
}
