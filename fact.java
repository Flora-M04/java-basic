import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =n; i>=1;i--){
            n= n*i;
        }
        System.out.println(n);
    }
}
