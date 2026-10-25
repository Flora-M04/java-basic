package pattern_codes;
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TotRows= sc.nextInt();
        for(int i =1;i<=TotRows;i++){
            for(int j =1;j<=TotRows-i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
