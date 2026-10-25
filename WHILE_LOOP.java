import java.util.Scanner;
import java.util.Arrays;
public class WHILE_LOOP {

    public static void main(String[] args) {
//1
/*        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
//2
        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
//3
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
//4
        for (i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
//5
Scanner sc = new Scanner(System.in);
System.out.println("give the input number:");
int i = 1;
int N = sc.nextInt();
 while (i<=10){
    System.out.println(N+ "*" + i + "=" +N*i);
                i++;
        }

//6
Scanner sc = new Scanner(System.in);
int sum = 0;
int i = 1;
System.out.println("give the input number:");
int N = sc.nextInt();
while(i<=N){
   sum = (N*(N+1))/2;
   i++;
        }
System.out.println(sum);
*/
Scanner sc = new Scanner(System.in);
int sum = 0;
System.out.println("give the input number:");
int N = sc.nextInt();
String s = Integer.toString(N);
char [] arr = s.toCharArray();
System.out.println(Arrays.toString(arr));
for(int i = 0;i==arr.length;i++){
    sum = sum+arr[i];
}
        System.out.println(sum);
    }
}