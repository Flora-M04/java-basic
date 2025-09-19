import java.util.Scanner;
public class weekswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int day = sc.nextInt();

        switch (day){
            case 1: System.out.println("Its Monday");
                   break;
            case 2:
                System.out.println("It's Tuesday");
                   break;
            case 3: System.out.println("Its wednesday");
                   break;
            case 4: System.out.println("Its Thursday");
                break;
            case 5: System.out.println("Its friday");
                break;
            case 6: System.out.println("Its saturday");
                break;
            case 7: System.out.println("Its Sunday");
                break;
            default:
                System.out.println("Invalid Input");
                break;
            }

        }
    }




