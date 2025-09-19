import java.util.Scanner;
public class posnevnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Its a positive number");
        }
        else{
            System.out.println("Its a negetive number");
        }
    }
}
