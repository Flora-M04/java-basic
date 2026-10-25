package func;

public class avg_sum {
    public static int avg_sum(int a , int b, int c){
        int sum = a+b+c;
        int avg = sum/3;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println(avg_sum(4,5,6));

    }
}
