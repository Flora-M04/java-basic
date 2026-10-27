import java.util.Scanner;
public class reverseNumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int N = sc.nextInt();

        while (N > 0){
            int lastDigit = N%10;
            System.out.println(lastDigit);
            N = N/10;
        }
        System.out.println();
    }


}
