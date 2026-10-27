package pattern_codes;

public class Reverse_inverted_left_triangle {
    public static void main(String[] args) {
        for(int i = 5;i>=1;i--){
            for(int x = 5;x>i;x--){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
