package OOP.Encapsulation;

public class PlayerNoEncap {
// NO ENCAPSULATION:
    public String fullName; // Anytime these fields name is changed, the main class also has to be changed
    public int health; // This is not good as changes here should not affect the main class, this is
    public String weapon; // due to improper encapsulation

    public void loseHealth(int damage){
        health=health-damage;
        if(health<=0){
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth){
        health=health+extraHealth;
        if(health>100){
            System.out.println("Player restored to 100%");
            health=100;
        }
    }
}
