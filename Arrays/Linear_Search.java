package Arrays;

import java.sql.SQLOutput;

public class Linear_Search {
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = Linear_Search(numbers,key);
        if(index == -1){
            System.out.println("Key Not Found");
        }
        else{
            System.out.println("Key Found at index:" +index);
        }
    }

    public static int Linear_Search(int numbers[], int key) {
        int i = 0;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

}