package sem_exercises.ex_3;

import java.util.Arrays;
import java.util.HashMap;

public class ArraysMain {
    public static void main(String[] args) {
        // generateArray return new int array
        int[] array = generateArray(10);
        // Arrays.toString() override toString method to get array's data not the address in memory
        System.out.println(Arrays.toString(array));

        System.out.printf("Sum with for loop: %d is equal to sum with lambda function: %d\n", getSum(array), getSumLambda(array));

        array[5] = 6;
        array[7] = 6;
        array[8] = 6;
        System.out.println(Arrays.toString(array));
        System.out.println("Most common: " + mostCommon(array));
    }

    private static int[] generateArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }

    // foreach loop does not iterate through indexes but through element
    private static int getSum(int[] array){
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Well, Arrays.stream convert the int array to stream of data and calls sum() function that calculates the sum of all elements
    private static int getSumLambda(int[] array){
        return Arrays.stream(array).sum();
    }

    // to find the most common element in array we need to know its count in the array
    private static int mostCommon(int[] array){
        int maxCount = 0;
        int result = 0;
        // first we iterate through all elements
        for (int num : array) {
            int currCnt = 0;
            // start iterating again
            for (int nextNum : array) {
                // compare the num in the first loop with the num in the second loop
                if (num == nextNum) {
                    currCnt++;
                }
            }

            // if count on the current number is bigger that the max count we know then the result is equal to this number
            if (currCnt > maxCount) {
                maxCount = currCnt;
                result = num;
            }
            // then takes the next element and do this again
        }

        return result;
    }
}
