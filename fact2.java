public class fact2 {
    public static int factorial(int num) {
        int factorial= 1;
        for (int i = num; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

}

