package Arrays;

public class VarArgs {
    public static void main(String... args) { // This will make it so that while execution java will take
    // any amount of strings and form an array out of it which will be named args in the main method
        
        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("-".repeat(30));
        printText("Hello");

        System.out.println("-".repeat(30));
        printText("Hello","World","Nope");

        System.out.println("-".repeat(30));
        printText();

        // this will join the array into a single string:
        String[] sArray = {"first","second","third","fourth"};
        System.out.println(String.join(",", sArray));
    }

    // Doing this over [private static void printText(String[] textList)] does the same thing but gives us
    // more options like just passing a single string if we wanted to

    // HOWEVER, there are rules to follow: Only one varArg per method and it must be the last argument
    private static void printText(String... textList){
        for(String t:textList){
            System.out.println(t);
        }
    }
}
