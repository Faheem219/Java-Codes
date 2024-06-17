package OOP;

public class string {
    public static void main(String[] args) {
        // Using escape sequences for formatting (\\,\n,\",\t):
        String bulletIt="Print a Bulleted List:\n"+"\t\u2022 First Point\n"+"\t\t\u2022 Sub Point";

        System.out.println(bulletIt+"\n");

        // Using a text block:
        String textBlock="""
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point
                """;
        
        System.out.println(textBlock);

        // Using printf (which is the same as in C/C++):
        int age=35;
        System.out.printf("Your are is %.2f%n",(float)age); // %n is the same as \n

        for(int i=1;i<=100000;i*=10){
            System.out.printf("Printing %6d %n",i);
        }

        // Using String.format():
        String formattedString=String.format("%nYour age is %d", age);
        System.out.println(formattedString);

        formattedString="%nYour age is %d".formatted(age); // Same as above
        System.out.println(formattedString);

        System.out.println("\n=======================================");
        System.out.println("        String Inspection Methods       ");
        System.out.println("=======================================\n");

        printInformtion("Hello World");
        String helloWorld = "Hello World";
        System.out.printf("Index of r = %d %n",helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n",helloWorld.indexOf("World"));

        System.out.printf("Index of l = %d %n",helloWorld.indexOf('l'));
        System.out.printf("Index of l = %d %n",helloWorld.lastIndexOf('l'));

        System.out.printf("Index of l = %d %n",helloWorld.indexOf('l',3));

        System.out.println("\n=======================================");
        System.out.println("        String Comparison Methods       ");
        System.out.println("=======================================\n");

        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorldLower.equals(helloWorld)){ // This cannot compare string builder values
            System.out.println("Values match exactly");
        }
        if(helloWorldLower.equalsIgnoreCase(helloWorld)){
            System.out.println("Values match ignoring case");
        }

        if(helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }
        if(helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }
        if(helloWorld.contains("World")){
            System.out.println("String contains with World");
        }

        if(helloWorld.contentEquals("Hello World")){ // This can also compare string builder values
            System.out.println("Values match exactly");
        }

        System.out.println("\n=======================================");
        System.out.println("       String Manipulation Methods      ");
        System.out.println("=======================================\n");

        String birthDate="25/11/1982";
        int startingIndex=birthDate.indexOf("1982");
        System.out.println("startingIndex = "+startingIndex);

        System.out.println("Birth year = "+birthDate.substring(startingIndex));
        System.out.println("Month = "+birthDate.substring(3, 5));

        String newDate = String.join("/","25","11","1982");
        System.out.println("newDate = "+newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = "+newDate);

        newDate = "25"+"/"+"11"+"/"+"1982";
        System.out.println("newDate = "+newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = "+newDate);

        // This will by default replace all the instances of target
        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace("2", "00"));

        // replaceFirst and replaceAll look for Regular Expressions in a string
        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2)); // With -ve value, it will remove leading space
        System.out.println("-".repeat(20));
    }

    public static void printInformtion(String string){
        System.out.printf("Length = %d%n",string.length());
        if(string.isEmpty()){
            System.out.println("String is empty");
            return;
        }
        if(string.isBlank()){ // Means the string isnt empty but just contains escape sequences or something
            System.out.println("String is blank");
            return;
        }
        System.out.printf("First char = %c%n",string.charAt(0));
        System.out.printf("Last char = %c%n",string.charAt(string.length()-1));
    }
}
