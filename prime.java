import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        if (num == 2) {
            System.out.println("2 is prime");
        }else{
            for(int i=2;i<num;i++){
                if(num % i ==0){
                    System.out.println("entered number is not prime.");
                    break;
                }
                else{
                    System.out.println("number entered is prime.");
                }

        }

        }
    }
}
