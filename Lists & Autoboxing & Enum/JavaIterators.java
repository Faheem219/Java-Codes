import java.util.*;

public class JavaIterators {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>(List.of("Sydney","Canberra","Darwin","Melbourne"));
        //testIterator(placesToVisit); 
        testListIterator(placesToVisit);
    }

    // This iterator only moves forwards and only supports remove method:
    private static void testIterator(LinkedList<String> list){
        var iterator = list.iterator();
        while(iterator.hasNext()){
            // System.out.println(iterator.next());
            if(iterator.next().equals("Canberra")){
                //list.remove(); This will throw an error as we are in a loop
                iterator.remove(); // This allows safe removal of element while still iterating
            }
        }
        System.out.println(list);
    }

    // listIterator has additional functionality like add and set methods and can move in both directions:
    private static void testListIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while(iterator.hasNext()){
            // System.out.println(iterator.next());
            if(iterator.next().equals("Canberra")){
                iterator.add("Lake Wivenhoe"); // This will add after Canberra
            }
        }
        // This will be false after iterating over the list once above
        // while(iterator.hasNext()){ // We cannot reset this instance, we could create a new one or move backwards
        //     System.out.println(iterator.next());
        // }

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        // To set a custom cursor position in a iterator:
        var iterator2 = list.listIterator(3); // This doesnt mean its pointing at index 3, it is
        // in a position in between 2 & 3, same is true for all cases in all iterators
        System.out.println(iterator2.next());
    }
}
