package org.itstep.task04;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
        int[] list = new int[]{23, 43, 31, 12, 5, 10, 13};

        //uncomment this line for successful code execution
        //Arrays.sort(list);

        try{
            System.out.printf("Binary Search %d in integer array %s %n", 12,
                    Arrays.toString(list));
            binarySearch(list, 12);

            System.out.printf("Binary Search %d in integer array %s %n", 43,
                    Arrays.toString(list));
            binarySearch(list, 31);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
    public static void binarySearch(int[] input, int number) throws Exception {
        if(!isSorted(input)) throw new Exception("Array is not sorted!");
        int first = 0;
        int last = input.length - 1;
        int middle = (first + last) / 2;

        while (first <= last) {
            if (input[middle] < number) {
                first = middle + 1;
            } else if (input[middle] == number) {
                System.out.printf(number + " found at location %d %n", middle);
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println(number + " is not present in the list.\n");
        }
    }

    public static boolean isSorted(int[] array)
    {
        boolean sorted = true;
        for(int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                sorted = false;
                break;
            }
        }
        return  sorted;
    }
}
