import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
         int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
         int num2 = sc.nextInt();

        System.out.println("enter the operation:");
         char operation = sc.next().charAt(0);

        switch (operation){
           case '+':System.out.println(num1+num2);
               break;
           case '-':System.out.println(num2-num1);
               break;
           case '*':System.out.println(num2*num1);
               break;
           case '/':
               if (num2 !=0){
                   System.out.println(num1/num2);
                   break;
                   }
            case '%': System.out.println(num1%num2);
                      break;
            default:
               System.out.println("Invalid Operation");
       }
    }
}
