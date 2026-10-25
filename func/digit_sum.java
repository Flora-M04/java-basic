package func;
import java.util.*;
public class digit_sum {
    public static int dig_sum(int number) {
        int sum = 0;

        while (number>0){
            sum = sum + number%10;
            number=number/10;
        }

       return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer:");
        int num = sc.nextInt();

        System.out.println(dig_sum(num));

    }

}
