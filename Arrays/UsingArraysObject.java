package Arrays;

import java.util.*;

public class UsingArraysObject {
    public static void main(String[] args) {
        
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        // To sort the array:
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray)+"\n");

        // To completely fill the uninitialized array with a value other than default:
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray)+"\n");

        // To copy a array:
        int [] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray)+"\n");

        Arrays.sort(fourthArray); // This is a true copy, will not affect the original array
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray)+"\n");

        // If the length of copied array is smaller or larger
        int[] smallerArray = Arrays.copyOf(thirdArray, 5); // Only first n elements are copied
        System.out.println(Arrays.toString(smallerArray));
        int[] largerArray = Arrays.copyOf(thirdArray, 15); // the remaining elements get default values
        System.out.println(Arrays.toString(largerArray)+"\n");
    }

    private static int[] getRandomArray(int len){
        Random random = new Random(); // This is another class is java.util library, it has methods to 
        // return random numbers
        int[] newInt = new int[len];
        for(int i=0;i<len;i++){
            newInt[i]=random.nextInt(100); // Will not include 100
        }

        return newInt;
    }
}
