public class forLoop {
    public static void main(String[] args) {
        for(int counter=1;counter<=5;counter++)
            System.out.println(counter);
        for(double rate=2.0;rate<=5.0;rate++){
            if(rate>4.5) break;
            if(rate==3.0) continue;
            System.out.println(rate+"%: "+calculateInterest(10000, rate));
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
