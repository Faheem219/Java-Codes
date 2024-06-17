public class methodsBasic {
    // Java's virtual machine (JVM) looks for the main method
    public static void main(String[] args) {
        boolean gameOver=true;
        int score=800;
        int levelCompleted=5;
        int bonus=100;

        calculateScore(gameOver,score,levelCompleted,bonus);

        calculateScore(true, 10000, 8, 200);

        System.out.println("Your final score was: "+giveCalculatedScore(gameOver, score, levelCompleted, bonus));

    }
    // static means this method can be called by just its name
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore=score;
        
        if(gameOver){
            finalScore+=(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("Your final score was: "+finalScore);
        }
    }

    public static int giveCalculatedScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore=score;
        
        if(gameOver){
            finalScore+=(levelCompleted*bonus);
            finalScore+=1000;
        }

        return finalScore;
    }
}
