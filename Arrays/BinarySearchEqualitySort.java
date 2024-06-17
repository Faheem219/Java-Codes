package Arrays;

import java.util.*;

public class BinarySearchEqualitySort {
    public static void main(String[] args) {
        
        // Performing binary search on string array:
        String[] sArray = {"Able","Jane","Mark","Ralph","David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Mark")>=0){
            System.out.println("Found Mark in the list\n");
        }

        // Equality operation
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        if(Arrays.equals(s1, s2)){
            System.out.println("Arrays are equal\n");
        }
        else{
            System.out.println("Arrays are not equal\n");
        }

        int[] s3 = sortIntegers(s1);
        System.out.println(Arrays.toString(s3));
    }

    // Program to perform descending Bubble Sort:
    private static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag=false; // so as long as the for loop is executing the array is not sorted, cuz flat will be set to true
            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }
}
