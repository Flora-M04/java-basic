package func;
import java.util.*;
public class Prime_Range {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int range = sc.nextInt();
        for(int i = 2; i<=range;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
