import java.util.Scanner;
public class SumOfNint {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vale of N:");
        int N = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i<=N) {
            sum = sum + i ;
            i++;
        }
        System.out.println("Sum of N integers:" +sum);
    }
}
