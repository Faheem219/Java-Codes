public class operatorPrecedence {
    public static void main(String[] args) {
        double var=20.00;
        double var2=80.00;
        double res=(var+var2)*100.00;
        boolean isZero=(res%40.00==0);
        System.out.println("Value of boolean variable is: "+isZero);
        if(!isZero) System.out.println("Got some remainder");
    }
}
