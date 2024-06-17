public class whileDoWhileLoop {
    public static void main(String[] args) {
        int i=0;
        while(i<5){
            System.out.println(i);
            i++;
        }

        // Another common way:
        i=0;
        while(true){
            if(i>5) break;
            System.out.println(i);
            i++;
        }

        // do while:
        do{
            System.out.println(i);
            i++;
        }while(i<5);

        System.out.println("Sum of 125: "+sumDigits(125));
    }

    public static int sumDigits(int num){
        int sum=0;
        int n=0;
        while(num>0){
            n=num%10;
            sum+=n;
            num/=10;
        }
        return sum;
    }
}
