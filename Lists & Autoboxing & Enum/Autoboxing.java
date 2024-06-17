import java.util.*;

public class Autoboxing {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15); // Deprecated
        int unboxedInt = boxedInt.intValue(); // unnecessary

        // Automatic:
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
        // System.out.println(autoUnboxed.getClass().getName()); Invalid since its now a primitve type
    
        // Here we are assigning opposite results, but still java automatically does the box/unboxing operations
        Double resultBoxed = getLiteralDoublePrimitve();
        double resultUnboxed = getDoubleObject(); 

// AFFECT OF BOXING/UNBOXING ON ARRAYS & LISTS:
        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0]=50; // JVM will autobox before assigning to array
        System.out.println(Arrays.toString(wrapperArray)); 
        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a','b','c','d'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = getList(1,2,3,4,5,6); // JVM will automatically box while calling
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(Integer... varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i:varargs){
            aList.add(i);
        }
        return aList;
    }

    private static int returnAnInt(Integer i){ // This will automatically unbox and return 
        return i;
    }

    private static Integer returnAnInteger(int i){ // This will autobox
        return i; 
    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitve(){
        return 100.0;
    }
}
