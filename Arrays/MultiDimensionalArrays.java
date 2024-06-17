package Arrays;

import java.util.*;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
// TWO DIMENSIONAL ARRAYS:
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2)); // This will print the address of the nested elements
        System.out.println("array2 length = "+array2.length+"\n");

        for(int i=0;i<array2.length;i++){
            var innerArray = array2[i];
            for(int j=0;j<innerArray.length;j++){
                // System.out.print(array2[i][j]+" ");
                array2[i][j] = (i*10)+(j+1);
            }
            // System.out.println();
        }
        System.out.println();

        // Another way to prinr:
        for(int[] outer: array2){
            System.out.println(Arrays.toString(outer)+"\n");
        }

        // Using enhanced for loops:
        for(var outer:array2){ // Java will automatically infer the type of the array during runtime
            for(var element:outer){
                System.out.print(element+" ");
            }
            System.out.println();
        }
        System.out.println();

        // Using built in method inside Arrays class:
        System.out.println(Arrays.deepToString(array2));

        System.out.print("\n"+"-".repeat(30)+"\n   MultiDimensional Arrays   \n"+"-".repeat(30)+"\n");

// MULTI DIMENSIONAL ARRAYS:
        array2[1] = new int[] {10,20,30}; // new int[] is necessary, anonymous initialization not allowed here
        // only allowed during declaration
        System.out.println(Arrays.deepToString(array2)+"\n");

        // This is bad practice (as any data type, even a simple string could be added here which would throw
        // an error when it hits the for each loop below):
        Object[] anyArray = new Object[3];
        anyArray[0] = new String[] {"a","b","c"};
        anyArray[1] = new String[][]{
            {"1","2"},
            {"3","4","5"},
            {"6","7","8","9"}
        };
        anyArray[2] = new int[2][2][2];
        // This will be messy:
        System.out.println(Arrays.deepToString(anyArray)+"\n");

        for(Object element: anyArray){
            System.out.println("Element type = "+element.getClass().getSimpleName());
            System.out.println("Element toString() = "+element);
            System.out.println(Arrays.deepToString((Object[]) element)+"\n");
        }

    }
}
