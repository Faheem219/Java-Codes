import java.util.Scanner;

public class readingUserInput {
    public static void main(String[] args) {
        // Parsing:
        int currentYear = 2024;
        String usersDateOfBirth = "1999";

        int DateOfBirth = Integer.parseInt(usersDateOfBirth);
        System.out.println("Age = " + (currentYear - DateOfBirth));

        String usersAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The user is apparantly: " + ageWithPartialYear);

        // Taking user input (Also Exception Handling):
        // try{
        // System.out.println(getInputFromConsole(currentYear));
        // }catch(NullPointerException e){
        // System.out.println(getInputFromScanner(currentYear));
        // }
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    // This method (console) is automatically disabled by IDEs (IntelliJ), have to
    // run using terminal:
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, whats your name?\n");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born?\n");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    // Using scanner class with System.in, can also be used with a file
    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, whats your name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

        System.out.println("What year were you born?");
        String dateOfBirth = scanner.nextLine();
        // Adding number format exception handling:
        int age = 0;
        try {
            age = currentYear - Integer.parseInt(dateOfBirth);
        } catch (NumberFormatException badUserData) {
            System.out.println("Characters not allowed! "+badUserData);
        }

        scanner.close();
        return "So you are " + age + " years old";
    }
}
