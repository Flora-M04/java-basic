package func;
import java.util.*;


public class Binomial_Coefficient {
    public static int factorial(int num) {
        int factorial= 1;
        for (int i = num; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int fact(int n , int r){
       int fact_n  = factorial(n);
       int fact_r = factorial(r);
       int fact_nmr = factorial(n-r);
       int BC = fact_n /(fact_r * fact_nmr);
       return BC;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of r:");
        int r = sc.nextInt();
        int cal = fact(n,r);
        System.out.println("Binomial Coefficient: " + cal);

        sc.close();
    }   
}
