package pattern_codes;
import java.util.Scanner;
public class LEFT_INVERTED_right_angle_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("Enter the number:");
        int n1 = sc.nextInt();
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

    }
}
