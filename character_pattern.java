public class character_pattern {
    public static void main(String[] args) {
        char ch = 'A';
        for(int row = 0; row<=4;row++){
            for(int col = 0; col<=row;col++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
