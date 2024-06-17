package OOP;

public class myStringBuilder {
    public static void main(String[] args) {
        String helloWorld = "Hello "+"World";
        helloWorld.concat(" and Goodbye"); // This will not update the existing string, it creates a 
        // new string and will return the reference to the this string

        // StringBuilder helloWorldBuilder = "Hello"+" World"; This will not work
        StringBuilder helloWorldBuilder = new StringBuilder("Hello"+" World");
        helloWorldBuilder.append(" and Goodbye"); // This will update the existing string

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder(); // By default capacity is 16
// Everytime its updated with a larger string (than 16), it will create a new object & allocate memory to that
// The new allocation size depends on the JVM
        emptyStart.append("a".repeat(17));
    
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello"+" World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string){
        System.out.println("String = "+string);
        System.out.println("Length = "+string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("String = "+builder);
        System.out.println("Length = "+builder.length());
        System.out.println("Capacity = "+builder.capacity());
    }
}
