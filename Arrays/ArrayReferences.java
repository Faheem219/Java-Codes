package Arrays;

import java.util.*;

public class ArrayReferences {
    public static void main(String[] args) {
        
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; // This is simply doing pointer stuff like in C++

        anotherArray[0]=1; // Therefore, this will change both the arrays

        System.out.println("myIntArray = "+Arrays.toString(myIntArray));
        System.out.println("anotherArray = "+Arrays.toString(anotherArray));

        modfifyArray(myIntArray);
        System.out.println("myIntArray = "+Arrays.toString(myIntArray));
        System.out.println("anotherArray = "+Arrays.toString(anotherArray));
    }

    // This will change the original array as well, if you dont want this pass a copy of the array
    private static void modfifyArray(int[] array){
        array[1]=2;
    }
}
