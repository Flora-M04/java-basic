package Arrays;

public class Largest_Value  {
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 1, 16, 12, 14, 16};
        int LargestIndex = getindex(numbers);
        System.out.println("Largest value:"+numbers[LargestIndex]);
        System.out.println("Key Found at index:"+LargestIndex );

    }

    public static int getindex(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int index =-1;
        int index_value=-1;
        for(int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
                index =i;
            }if (smallest > numbers[i]) {
                smallest = numbers[i];
                index_value =i;
            }
        }
        System.out.println("smallest value is :" +smallest);
        System.out.println("smallest index is :" +index_value);

        return index;

    }

}