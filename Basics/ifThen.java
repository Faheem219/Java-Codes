public class ifThen {
    public static void main(String[] args){
        boolean isAlien=false;
        if(isAlien==false) System.out.println("It is not an alien");

        int topScore=100;
        if(topScore>=100){
            System.out.println("You got the high score!");
        }

        int secondTopScore=60;
        if(topScore>secondTopScore && topScore==100){
            System.out.println("Score greater than 2nd and equal to 100");
        }

        // int newValue=50;
        // if(newValue=50){         Expected boolean type got int type
        //     System.out.println("This cannot happen");
        // }

        // boolean isCar=false;
        // if(isCar=true){ Here isCar=true returned the boolean true, above it returned in int value 50
        //     System.out.println("How could this happen");
        // }
    }
}
