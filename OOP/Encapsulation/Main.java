package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
// NO ENCAPSULATION:
        // A problem of improper encapsulation is that the main class has to initialize all fields manually
        // PlayerNoEncap player = new PlayerNoEncap();
        // player.name = "Tim";
        // player.health=20;
        // player.weapon="Sword";

        // int damage=10;
        // player.loseHealth(damage);
        // System.out.println("Rem health = "+player.healthRemaining());
        // player.health=200; // The main has gone rogue, its taking the control from the class & setting invalid values
        // player.loseHealth(11);
        // System.out.println("Rem health = "+player.healthRemaining());

// PROPER ENCAPSULATION:
        EnhancedPlayerEncap tim = new EnhancedPlayerEncap("Tim",200,"Sword");
        // Even with an improper health it corrects it
        System.out.println("Init health is "+tim.healthRemaining());
    }
}
