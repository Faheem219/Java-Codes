import java.util.*;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s",count,name.toUpperCase(),type);
    }
}

public class ArrayLists {
    public static void main(String[] args) {
        // Object[] groceryArray = new Object[3]; // If we do this invalid data may also be allowed to enter
        GroceryItem[] groceryArray = new GroceryItem[3]; // Declaring an array with specific data type
        // allows for compile time type checking which prevents runtime errors
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples","PRODUCE",6);
        // groceryArray[2] = "5 oranges"; // This is invalid data
        groceryArray[2] = new GroceryItem("oranges","PRODUCE",5);
        System.out.println(Arrays.toString(groceryArray));

        // The ArrayList by default will use Object type, this is called raw use of ArrayList, it will
        // result in the same error above, it has to be parameterized:
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("butter"));
        objectList.add("yoghurt");

        // Both are good (size need not be defined while creating ArrayList):
        //ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges","PRODUCE",5));
        groceryList.add(0,new GroceryItem("apples","PRODUCE",6)); // Will add at index 0
        groceryList.set(0,new GroceryItem("mangoes","PRODUCE",6)); // Will replace item at index 0
        groceryList.remove(1); // Will remove item at index 1
        System.out.println(groceryList);

// USING LISTS AS INPUT FOR CREATING ArrayLists:
        String[] items = {"apple","bananas","milk","eggs"};
        List<String> list = List.of(items); // .of (factory method) is used to add items in the list (its immutable)
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yoghurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles","mustard","cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList); // Used to add an entire collection (ArrayList) to another
        System.out.println(groceries);

// ACCESSING ELEMENTS:
        System.out.println("Third term = "+groceries.get(2));

        if(groceries.contains("mustard")) System.out.println("List contains mustard");

        // Will return -1 if element not found:
        System.out.println("first = "+groceries.indexOf("yoghurt"));
        System.out.println("last = "+groceries.lastIndexOf("yoghurt"));
        groceries.remove("yoghurt"); // Will only remove the first yoghurt
        groceries.removeAll(List.of("apples","eggs")); // Will remove multiple elements
        System.out.println(groceries);

        // Will delete all elements except the ones defined here:
        groceries.retainAll(List.of("apples","milk","mustard","cheese"));
        System.out.println(groceries);

        groceries.clear(); // To empty the list
        System.out.println("is Empty = "+groceries.isEmpty());

        groceries.addAll(List.of("apples","milk","mustard","cheese"));
        groceries.addAll(Arrays.asList("eggs","pickles","mustard","ham")); // .asList is a factory
        // method which will create a list and and add it to the ArrayList

        // Sorting elements:
        groceries.sort(Comparator.naturalOrder()); // .naturalOrder() is a static factory method for comparator
        // naturalOrder means Strings will be sorted alphabetically (ASCII), numbers from lowest to highest etc.
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder()); // To sort in reverse order
        System.out.println(groceries);

// Getting an array from an ArrayList:
        var groceriesArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceriesArray));

// MULTIDIMENSIONAL ArrayList:
        ArrayList<ArrayList<String>> multiDList = new ArrayList<>();
        multiDList.add(groceries);
        multiDList.add(nextList);
        System.out.println(multiDList);

// ARRAYS VS ArrayLists:
        String[] originalArray = new String[] {"First","Second","Third"};
        var originalList = Arrays.asList(originalArray); // This will return a special type of list
        // The list is now backed by the array, meaning any change in either will result in change in both
        originalList.set(0,"one");
        System.out.println("list: "+originalList);
        System.out.println("array: "+Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: "+Arrays.toString(originalArray)); // Will sort using ASCII

        //originalList.remove(0); This will not work as the list is backed by an array it is immutable
        //originalList.add("fourth"); This will also not work while runtime, it will compile tho

        // This can be used to create a fixed size list:
        List<String> newList = Arrays.asList("one","two","three");
        System.out.println(newList);

// TO SET CAPACITY OF AN ARRAY LIST:
        ArrayList<String> stringArray = new ArrayList<>(500000);
    }
}
