package func;

public class binToDec {
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int DecNum=0;

        while(binNum > 0){
            int last_digit = binNum % 10;
            DecNum = DecNum+(last_digit * (int)Math.pow(2,pow));
            pow++;

            binNum=binNum/10;
        }
        System.out.println("decimal of" +myNum+" = " + DecNum);

    }

    public static void main(String[] args) {
        binToDec(111);
    }
}
