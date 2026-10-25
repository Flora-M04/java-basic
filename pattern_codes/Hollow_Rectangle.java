package pattern_codes;

public class Hollow_Rectangle {
    public static void Hollow_Rectangle(int TotRows, int TotCols) {
        for (int i = 0; i <= TotRows; i++) {
            for (int j = 0; j <= TotCols; j++) {
                if(i==0 || i==TotRows || j==0 || j == TotCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Hollow_Rectangle(9,6);
    }
}