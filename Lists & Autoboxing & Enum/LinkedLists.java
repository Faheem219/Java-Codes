import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {
        
        //LinkedList<String> placesToVisit = new LinkedList<>();
        // Var can also be used to create LL, but angle braces on RHS should contain data type:
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        // removeElements(placesToVisit);
        // gettingElements(placesToVisit);
        // printItinerary(placesToVisit);
        // printItinerary2(placesToVisit);
        printItinerary3(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Queue methods:
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        // Stack methods:
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // removes first element
        System.out.println(s1+" was removed");

        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2+" was removed");

        String s3 = list.removeLast(); // removes last element
        System.out.println(s3+" was removed");

        // Queue/Dequeue poll methods:
        String p1 = list.poll(); // removes first element
        System.err.println(p1+" was removed");

        String p2 = list.pollFirst(); // removes first element
        System.err.println(p2+" was removed");

        String p3 = list.pollLast(); // removes last element
        System.err.println(p3+" was removed");

        list.push("Sydney"); list.push("Brisbane"); list.push("Canberra");
        // Stack method:
        String p4 = list.pop();
        System.out.println(p4+" was removed");
    }

    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieved Element = "+list.get(4));
        System.out.println("Retrieved Element = "+list.getFirst());
        System.out.println("Retrieved Element = "+list.getLast());

        System.out.println("Darwin at: "+list.indexOf("Darwin"));
        System.out.println("Melb is at position: "+list.lastIndexOf("Melbourne"));

        // Queue retrieval methods:
        System.out.println("Element from element() = "+list.element()); // first element
        // Stack retrieval methods:
        System.out.println("Element from peek() = "+list.peek()); // first element
        System.out.println("Element from peekFirst() = "+list.peekFirst()); // first element
        System.out.println("Element from peekLast() = "+list.peekLast()); // last element
    }

    // Traditional for loop
    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at: "+list.getFirst());
        for(int i=1;i<list.size();i++){
            System.out.println("--> From: "+list.get(i-1)+" to "+list.get(i));
        }
        System.out.println("Trip ends at: "+list.getLast());
    }

    // For each loop
    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip starts at: "+list.getFirst());
        String previousTown = list.getFirst();
        for(String town: list){
            System.out.println("--> From: "+previousTown+" to "+town);
            previousTown=town;
        }
        System.out.println("Trip ends at: "+list.getLast());
    }

    // List iterator
    public static void printItinerary3(LinkedList<String> list){
        System.out.println("Trip starts at: "+list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1); // Starting from 2nd element not 1st
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From: "+previousTown+" to "+town);
            previousTown=town;
        }
        System.out.println("Trip ends at: "+list.getLast());
    }
}
