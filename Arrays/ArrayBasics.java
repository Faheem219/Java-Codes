package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        // myIntArray[0]="1"; This wont work
        // myIntArray[1]=1.0; This wont work either
        myIntArray[5]=50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2]=3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("First = "+firstTen[0]);
        System.out.println("Length of array = "+firstTen.length); // <arrayName>.length to get length of the array
        System.out.println("Last = "+firstTen[firstTen.length-1]+"\n");

        int [] newArray;
        // newArray = {5,4,3,2,1}; This wont work, anonymous array initializer only works in a declaration statement
        newArray = new int[]{5,4,3,2,1};
        for(int i=0;i<5;i++){
            System.out.print(newArray[i]+" ");
        }
        System.out.println();

        // Enhanced For loop (for each loop):
        for(int element:newArray){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println(newArray); // This will print the address of the first element of the array
        System.out.println(Arrays.toString(newArray)+"\n"); // This will neatly print out the array

        // Splitting a string into a array (Can be used to create a user defined array using scanner by
        // including a comma "," in the regular expression of the split function):
        String[] splitStrings = "Hello World again".split(" ");
        System.out.println(Arrays.toString(splitStrings)+"\n");

        // User defined array:
        int[] userDefinedArray = readIntegers();
        System.out.println(Arrays.toString(userDefinedArray)+"\n");

        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("Its really an int array\n");
        }

        // We can create an array of Objects that supports any data type in java
        // This is one way to have an array of multiple data types but not usually preferred
        Object[] objectArray = new Object[3];
        objectArray[0]="Hello";
        objectArray[1]=new StringBuilder("world");
        objectArray[2]=newArray;
        System.out.println(Arrays.toString(objectArray)+"\n");
    }

    private static int[] readIntegers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of integers, seperated by commas:");
        String input = sc.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];
        for(int i=0;i<splits.length;i++){
            values[i]=Integer.parseInt(splits[i].trim()); // Trim will remove any leading or trailing space from integer
        }
        sc.close();
        return values;
    }
}
