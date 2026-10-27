package pattern_codes;

public class inverted_left_number_triangle {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++)
        {
            for (int x= 1;x<i;x++)
            {
                System.out.print("");
            }
            for(int j = i;j<=5;j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

}
