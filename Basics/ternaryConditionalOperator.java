public class ternaryConditionalOperator {
    public static void main(String[] args) {
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic)
            System.out.println("This car is domestic somewhere");

        String s = (isDomestic)?"This car is domestic":"This is not domestic";
        System.out.println(s);
    }
}
