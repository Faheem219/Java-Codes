public class methodOverloading {
    public static void main(String[] args) {
        int newScore=calculateScore("Tim", 500);

        System.out.println("Score: "+newScore);
        System.out.println("New Score: "+calculateScore(1000));
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score+" points");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored "+score+" points");
        return score*1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score ");
        return 0;
    }

/*  Just changing the return value will not be ok, you have to change the parameters too or just their data type
    public static void calculateScore(){
        System.out.println("No player name, no player score ");
    }
*/
}
